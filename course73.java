class Ex1 extends Exception {
    public Ex1(String message) {
        super(message);
    }
}

class Ex2 extends Ex1 {
    public Ex2(String message) {
        super(message);
    }
}

class Ex3 extends Ex2 {
    public Ex3(String message) {
        super(message);
    }
}

public class course73 {
    public static void main(String[] args) {
        try {
            // Генерация исключений для первой ситуации
            throw new ArithmeticException();
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("Catched " + e);
        }

        try {
            // Генерация исключений для второй ситуации
            throw new Ex3("Ex3 exeption");
        } catch (Ex1 e) {
            System.out.println("Ex1: " + e.getMessage());
        }
    }
}
