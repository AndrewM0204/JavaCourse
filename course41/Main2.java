// Финальный класс
final class FinalClass {
    public void display() {
        System.out.println("This is a final class");
    }
}

// Попытка создать подкласс
class ChildClass extends FinalClass { // Ошибка компиляции
    @Override
    public void display() {
        System.out.println("Trying to override method in final class");
    }
}

// Главный класс
public class Main2 {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.display();
    }
}
