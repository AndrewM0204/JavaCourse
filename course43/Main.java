class OverloadedMethods {
    // Метод без параметров
    public void display() {
        System.out.println("Display method without parameters");
    }

    // Метод с одним параметром типа int
    public void display(int number) {
        System.out.println("Display method with one integer: " + number);
    }

    // Метод с двумя параметрами: int и String
    public void display(int number, String text) {
        System.out.println("Display method with integer and string: " + number + ", " + text);
    }

    // Метод с параметром другого типа (double)
    public void display(double number) {
        System.out.println("Display method with double: " + number);
    }
}

public class Main {
    public static void main(String[] args) {
        OverloadedMethods obj = new OverloadedMethods();
        
        obj.display(); // Вызов метода без параметров
        obj.display(10); // Вызов метода с параметром int
        obj.display(20, "Hello"); // Вызов метода с int и String
        obj.display(15.5); // Вызов метода с параметром double
    }
}
