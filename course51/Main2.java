class Outer {
    private int a = 10;  // private поле
    protected int b = 20;  // protected поле
    public int c = 30;  // public поле

    private void privateMethod() {
        System.out.println("privateMethod in Outer");
    }

    protected void protectedMethod() {
        System.out.println("protectedMethod in Outer");
    }

    public void publicMethod() {
        System.out.println("publicMethod in Outer");
    }

    // Внутренний класс
    class Inner {
        void accessOuter() {
            // Доступ к полям внешнего класса
            System.out.println("a = " + a);  // доступно
            System.out.println("b = " + b);  // доступно
            System.out.println("c = " + c);  // доступно

            // Доступ к методам внешнего класса
            privateMethod();  // доступно
            protectedMethod();  // доступно
            publicMethod();  // доступно
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.accessOuter(); // Внутренние классы имеют доступ ко всем полям и методам внешнего класса, независимо от их спецификаторов доступа
    }
}
