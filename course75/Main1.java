import java.io.ByteArrayOutputStream;

public class Main1 {
    public static void main(String[] args) {
        // Создаем объект ByteArrayOutputStream
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        baos.write(72);  // ASCII код для 'H'
        baos.write(101); // ASCII код для 'e'
        baos.write(108); // ASCII код для 'l'
        baos.write(108); // ASCII код для 'l'
        baos.write(111); // ASCII код для 'o'

        // Преобразуем записанные байты в строку
        String result = baos.toString();
        System.out.println(result);
    }
}
