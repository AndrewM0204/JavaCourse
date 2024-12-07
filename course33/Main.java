class Box<T> {
    private T item;

    public Box(T item) {
        this.item = item;
    }
}

public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("Test");
        if (stringBox instanceof Box) {
            System.out.println("stringBox is an instance of Box");
        }// Параметризация (String) игнорируется, и проверка происходит только на уровень базового класса Box.
    }
}
