interface InterfaceA {
    // Неабстрактный (default) метод в интерфейсе A
    default void showMessage() {
        System.out.println("Message from InterfaceA");
    }
}

interface InterfaceB {
    // Неабстрактный (default) метод в интерфейсе B
    default void showMessage() {
        System.out.println("Message from InterfaceB");
    }
}

class MyClass implements InterfaceA, InterfaceB {
    // Возникает конфликт, перегрузка метода showMessage() для разрешения конфликта
    @Override
    public void showMessage() {
        // Здесь можно выбрать, какой метод вызвать
        // Вариант 1: вызвать метод из InterfaceA
        InterfaceA.super.showMessage();
        
        // Вариант 2: вызвать метод из InterfaceB
        // InterfaceB.super.showMessage();
        
        // Логика собственного метода
        System.out.println("Message from MyClass");
    }
}

public class Main1 {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.showMessage(); // Вызов метода showMessage()
    }
}
