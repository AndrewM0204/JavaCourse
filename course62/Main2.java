import java.util.StringJoiner;

public class Main2 {
    public static void main(String[] args) {
        // Создание StringJoiner с разделителем ", "
        StringJoiner joiner = new StringJoiner(", ");
        joiner.add("Apple");
        joiner.add("Banana");
        joiner.add("Cherry");

        // Вывод соединенной строки
        System.out.println(joiner); // Output: Apple, Banana, Cherry
    }
}
