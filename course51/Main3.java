class Outer {
    private class Inner {
        private int a = 10;
        public int b = 10;

        private void display() {
            System.out.println("Inner class method called. a = " + a);
        }
    }

    void createInner() {
        Inner inner = new Inner();
        inner.display();  // Внешний класс может создавать экземпляры и работать с ними
        System.out.println("b = " + inner.b);  // Внешний класс может обращаться к public полям внутреннего класса
    }
}

public class Main3 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.createInner();
        // System.out.println(outer.inner.a);  // Ошибка, внешнему классу нельзя получить доступ к полям/методам внутреннего класса напрямую
    }
}
