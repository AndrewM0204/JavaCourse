interface MyInterface {
    // Неабстрактный (default) метод
    default void defaultMethod() {
        System.out.println("This is a default method.");
    }

    // Статический метод
    static void staticMethod() {
        System.out.println("This is a static method.");
    }
}

class MyClass implements MyInterface {
}

public class Main {
    public static void main(String[] args) {
        // Создаем объект класса, реализующего интерфейс
        MyClass myObject = new MyClass();

        // 1. Вызов default метода через объект
        myObject.defaultMethod(); // Вызов метода defaultMethod() через объект

        // 2. Вызов статического метода через имя интерфейса
        MyInterface.staticMethod(); // Вызов статического метода через имя интерфейса

        // 3. Вызов default метода через ссылку на интерфейс
        MyInterface interfaceRef = myObject;
        interfaceRef.defaultMethod(); // Вызов default метода через ссылку на интерфейс

        // Статический метод также можно вызвать через имя интерфейса
        MyInterface.staticMethod(); // Вызов статического метода через имя интерфейса
    }
}

