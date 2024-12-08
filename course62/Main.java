public class Main {
    public static void main(String[] args) {
        // 1. length() - Возвращает длину строки.
        String str = "Hello, World!";
        System.out.println("1. Length of string: " + str.length());

        // 2. charAt() - Возвращает символ, находящийся по указанному индексу.
        System.out.println("2. Character at index 7: " + str.charAt(7));

        // 3. substring() - Возвращает подстроку из строки.
        System.out.println("3. Substring from index 7: " + str.substring(7));
        System.out.println("3. Substring from 0 to 5: " + str.substring(0, 5));

        // 4. contains() - Проверяет, содержит ли строка указанную последовательность символов.
        System.out.println("4. Contains 'World': " + str.contains("World"));

        // 5. toUpperCase() - Преобразует строку к верхнему регистру.
        System.out.println("5. Uppercase string: " + str.toUpperCase());

        // 6. toLowerCase() - Преобразует строку к нижнему регистру.
        System.out.println("6. Lowercase string: " + str.toLowerCase());

        // 7. indexOf() - Возвращает индекс первого вхождения символа или строки.
        System.out.println("7. Index of 'o': " + str.indexOf('o'));
        System.out.println("7. Index of 'World': " + str.indexOf("World"));

        // 8. replace() - Заменяет все вхождения одной последовательности символов на другую.
        System.out.println("8. Replace 'World' with 'Java': " + str.replace("World", "Java"));

        // 9. split() - Разделяет строку на массив строк по заданному разделителю.
        String[] words = str.split(", ");
        System.out.println("9. Split string by ', ':");
        for (String word : words) {
            System.out.println(word);
        }

        // 10. equals() - Сравнивает строки на равенство (учитывая регистр).
        String anotherStr = "hello, world!";
        System.out.println("10. Equals 'hello, world!': " + str.equals(anotherStr));
        System.out.println("10. EqualsIgnoreCase 'hello, world!': " + str.equalsIgnoreCase(anotherStr));
    }
}
