import java.io.*;
import java.math.BigInteger;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.*;

public class HuffmanCoding {

    // Класс, представляющий узел дерева Хаффмана
    static class Node implements Comparable<Node> {
        int frequency;
        char character;
        Node left, right;

        // Конструктор для узлов, которые содержат символ
        public Node(char character, int frequency) {
            this.character = character;
            this.frequency = frequency;
            this.left = null;
            this.right = null;
        }

        // Конструктор для внутренних узлов дерева (без символа)
        public Node(int frequency, Node left, Node right) {
            this.character = '\0';  // Без символа
            this.frequency = frequency;
            this.left = left;
            this.right = right;
        }

        @Override
        public int compareTo(Node other) {
            return this.frequency - other.frequency;
        }
    }

    // Генерация кодов Хаффмана
    static Map<Character, String> generateHuffmanCodes(Node root) {
        Map<Character, String> codes = new HashMap<>();
        generateHuffmanCodesHelper(root, "", codes);
        return codes;
    }

    // Рекурсивный обход дерева для построения кодов
    private static void generateHuffmanCodesHelper(Node node, String code, Map<Character, String> codes) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            codes.put(node.character, code);
        }
        generateHuffmanCodesHelper(node.left, code + "0", codes);
        generateHuffmanCodesHelper(node.right, code + "1", codes);
    }

    // Построение дерева Хаффмана
    static Node buildHuffmanTree(Map<Character, Integer> frequencyMap) {
        PriorityQueue<Node> queue = new PriorityQueue<>();
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            queue.add(new Node(entry.getKey(), entry.getValue()));
        }

        while (queue.size() > 1) {
            Node left = queue.poll();
            Node right = queue.poll();
            Node parent = new Node(left.frequency + right.frequency, left, right);
            queue.add(parent);
        }
        if (queue.size() == 1) {
            Node one = queue.poll();
            Node parent = new Node(one.frequency, one, null);
            queue.add(parent);
        }

        return queue.poll();
    }

    // Кодирование строки
    public static String encode(String input, Map<Character, String> huffmanCodes) {
        StringBuilder encodedString = new StringBuilder();
        for (char c : input.toCharArray()) {
            encodedString.append(huffmanCodes.get(c));
        }
        return encodedString.toString();
    }

    // Декодирование строки
    static String decode(String encodedString, Node root) {
        StringBuilder decodedString = new StringBuilder();
        Node current = root;
        for (char bit : encodedString.toCharArray()) {
            current = bit == '0' ? current.left : current.right;
            if (current.left == null && current.right == null) {
                decodedString.append(current.character);
                current = root;
            }
        }
        return decodedString.toString();
    }

    public static byte[] add2BeginningOfArray(byte[] elements, byte element) {
        byte[] newArray = Arrays.copyOf(elements, elements.length + 1);
        newArray[0] = element;
        System.arraycopy(elements, 0, newArray, 1, elements.length);

        return newArray;
    }

    public static void writeMap(Map<Character, String> map, ObjectOutputStream oos) throws IOException {
        oos.writeInt(map.size());
        for (Map.Entry<Character, String> entry : map.entrySet()) {
            oos.writeChar(entry.getKey());
            String code = entry.getValue();
            oos.writeInt(code.length());
            oos.writeChars(code);
        }
    }

    // Function to read a Map from an ObjectInputStream
    public static Map<Character, String> readMap(ObjectInputStream ois) throws IOException {
        int size = ois.readInt();
        Map<Character, String> map = new HashMap<>(size);
        for (int i = 0; i < size; i++) {
            char key = ois.readChar();
            int code_size = ois.readInt();
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < code_size; j++) {
                stringBuilder.append(ois.readChar());
            }
            map.put(key, stringBuilder.toString());
        }
        return map;
    }

    // Запись кодированного файла
    public static void writeEncodedFile(String filename, String encodedData, Map<Character, String> huffmanCodes) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            //oos.writeObject(huffmanCodes);  // Записываем словарь кодов
            writeMap(huffmanCodes, oos);
            byte[] bval = new BigInteger(encodedData, 2).toByteArray();
            while(8*bval.length < encodedData.length()) {
                bval = add2BeginningOfArray(bval, (byte)0);
            }
            oos.writeInt(8*bval.length-encodedData.length());
            oos.write(bval);  // Записываем закодированные данные
        }
    }

    // Чтение из кодированного файла
    public static Object[] readEncodedFile(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            //Map<Character, String> huffmanCodes = (Map<Character, String>) ois.readObject();
            Map<Character, String> huffmanCodes = readMap(ois);
            int step = ois.readInt();
            byte[] encodedData = ois.readAllBytes();
            StringBuilder encodedString = new StringBuilder();
            for(byte b: encodedData){
                encodedString.append(String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0'));
            }
            return new Object[]{huffmanCodes, encodedString.toString().substring(step)};
        }
    }

    // Основной метод для кодирования
    public static void encodeFile(String inputFile, String outputFile) throws IOException {
        // Чтение данных из файла
        String input = new String(Files.readAllBytes(Paths.get(inputFile)), StandardCharsets.UTF_8);

        // Вычисление частот символов
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Построение дерева Хаффмана
        Node root = buildHuffmanTree(frequencyMap);

        // Генерация кодов Хаффмана
        Map<Character, String> huffmanCodes = generateHuffmanCodes(root);

        // Кодирование данных
        String encodedData = encode(input, huffmanCodes);

        // Запись кодированного файла
        writeEncodedFile(outputFile, encodedData, huffmanCodes);
    }

    // Основной метод для декодирования
    public static void decodeFile(String inputFile, String outputFile) throws IOException, ClassNotFoundException {
        // Чтение кодированного файла
        Object[] fileData = readEncodedFile(inputFile);
        Map<Character, String> huffmanCodes = (Map<Character, String>) fileData[0];
        String encodedData = (String) fileData[1];

        // Построение дерева Хаффмана из кодов
        Node root = buildHuffmanTreeFromCodes(huffmanCodes);

        // Декодирование данных
        String decodedData = decode(encodedData, root);

        // Запись декодированных данных в файл
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            writer.write(decodedData);
        }
    }

    // Воссоздание дерева Хаффмана из кодов
    static Node buildHuffmanTreeFromCodes(Map<Character, String> huffmanCodes) {
        Node root = new Node(0, null, null);
        for (Map.Entry<Character, String> entry : huffmanCodes.entrySet()) {
            Node current = root;
            String code = entry.getValue();
            for (char c : code.toCharArray()) {
                if (c == '0') {
                    if (current.left == null) current.left = new Node(0, null, null);
                    current = current.left;
                } else {
                    if (current.right == null) current.right = new Node(0, null, null);
                    current = current.right;
                }
            }
            current.character = entry.getKey();
        }
        return root;
    }

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java HuffmanCoding <encode/decode> <inputFile> <outputFile>");
            return;
        }

        try {
            if (args[0].equals("encode")) {
                encodeFile(args[1], args[2]);
                System.out.println("File encoded successfully.");
            } else if (args[0].equals("decode")) {
                decodeFile(args[1], args[2]);
                System.out.println("File decoded successfully.");
            } else {
                System.out.println("Invalid operation. Use 'encode' or 'decode'.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
