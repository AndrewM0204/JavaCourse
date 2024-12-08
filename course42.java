// Суперкласс
class Parent {
    protected String name = "Parent";
    
    // Конструктор суперкласса
    public Parent(String message) {
        System.out.println("Parent constructor: " + message);
    }
    
    // Метод суперкласса
    public void display() {
        System.out.println("Method from Parent class");
    }
}

// Подкласс
class Child extends Parent {
    protected String name = "Child";
    
    // Конструктор подкласса
    public Child(String message) {
        super(message); // (1) Вызов конструктора суперкласса
        System.out.println("Child constructor: " + message);
    }
    
    @Override
    public void display() {
        super.display(); // (2) Вызов метода суперкласса
        System.out.println("Method from Child class");
    }
    
    public void printNames() {
        System.out.println("Name in Child: " + name);
        System.out.println("Name in Parent: " + super.name); // (3) Доступ к скрытому полю суперкласса
    }
}

// Главный класс
public class course42 {
    public static void main(String[] args) {
        Child child = new Child("Hello");
        child.display();
        child.printNames();
    }
}
