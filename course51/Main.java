class Outer {
    private class Inner {
        void display() {
            System.out.println("Inside Inner class");
        }
    }

    void createInnerInstance() {
        Inner inner = new Inner();  // Доступно только внутри класса Outer
        inner.display();
    }
}

class Outer1 {
    class Inner1 {
        void display() {
            System.out.println("Inside Inner class with package access");
        }
    }
}

class Outer2 {
    protected class Inner2 {
        void display() {
            System.out.println("Inside Inner class with protected access");
        }
    }
}

class SubClass extends Outer2 {
    void createInnerInstance() {
        Inner2 inner = new Inner2();  // Доступно, так как SubClass расширяет Outer
        inner.display();  // Выведет: Inside Inner class with protected access
    }
}

class Outer3 {
    public class Inner3 {
        void display() {
            System.out.println("Inside Inner class with public access");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        // inner class cannot be accessed directly
        // Outer.Inner inner = new Outer().new Inner(); // Ошибка компиляции
        outer.createInnerInstance();  // Выведет: Inside Inner class
        Outer1 outer1 = new Outer1();
        Outer1.Inner1 inner1 = outer1.new Inner1();
        inner1.display();  // Выведет: Inside Inner class with package access
        SubClass subClass = new SubClass();
        subClass.createInnerInstance();
        Outer3 outer3 = new Outer3();
        Outer3.Inner3 inner = outer3.new Inner3();  // Доступно из любого класса
        inner.display();  // Выведет: Inside Inner class with public access
    }
}
