import java.util.ArrayList;
import java.util.List;

public class Main3 {
    // <? super T> указывает, что параметризованный тип может быть T или любым его супертипом (включая сам T).
    public static void addNumbers(List<? super Integer> numbers) {
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        addNumbers(numbers); // Number супертип Integer

        for (Object number : numbers) {
            System.out.println(number);
        }
    }
}
