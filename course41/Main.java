// Суперкласс
class Parent {
    public final void display() {
        System.out.println("Final method in Parent class");
    }
}

// Подкласс
class Child extends Parent {
    // Попытка переопределить метод display() приведет к ошибке компиляции
    @Override
    public void display() {
        System.out.println("Overridden method in Child class");
    }
}

// Главный класс
public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}
