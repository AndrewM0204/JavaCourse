import java.util.ArrayList;
import java.util.List;

public class Main2 {
    // <? extends T> указывает, что параметризованный тип может быть T или любым его подтипом (включая сам T).
    public static void printNumbers(List<? extends Number> numbers) {
        for (Number number : numbers) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);

        List<Double> doubles = new ArrayList<>();
        doubles.add(1.1);
        doubles.add(2.2);

        printNumbers(integers); // Integer - подтип Number
        printNumbers(doubles);  // Double - подтип Number
    }
}
