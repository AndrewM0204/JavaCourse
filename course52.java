interface MyInterface {
    void method();
    
    // Вложенный статический класс
    static class MyNestedClass {
        void nestedMethod() {
            System.out.println("Method in nested class.");
        }
    }
}

public class course52 {
    public static void main(String[] args) {
        // Создание экземпляра вложенного статического класса
        MyInterface.MyNestedClass nested = new MyInterface.MyNestedClass();
        nested.nestedMethod();  // Вызов метода вложенного класса
    }
}
