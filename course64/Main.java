public class Main {
    public static void main(String[] args) {
        // 1. %d — для целых чисел
        int number = 42;
        System.out.printf("Integer: %d%n", number); // Output: Целое число: 42

        // 2. %f — для чисел с плавающей точкой
        double pi = 3.141592653589793;
        System.out.printf("Pi: %f%n", pi); // Output: Число Пи: 3.14 (до двух знаков после запятой)

        // 3. %s — для строк
        String greeting = "Hello, World!";
        System.out.printf("Message: %s%n", greeting); // Output: Сообщение: Hello, World!

        // 4. %c — для символов
        char letter = 'A';
        System.out.printf("har: %c%n", letter); // Output: Символ: A

        // 5. %% — для вывода процента
        double percentage = 99.9;
        System.out.printf("Percentage: %f%%%n", percentage); // Output: Процент выполнения: 99.9%
    }
}
