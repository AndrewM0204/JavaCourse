class A {
    int a;
    int b;
    int c;
    int z;

    // Общий конструктор, инициализирующий поле z
    public A() {
        this.z = 1;
    }

    // Конструктор с одним параметром
    public A(int a) {
        this(); // Вызов конструктора A()
        this.a = a;
    }

    // Конструктор с двумя параметрами
    public A(int a, int b) {
        this(a); // Вызов конструктора A(int a)
        this.b = b;
    }

    // Конструктор с тремя параметрами
    public A(int a, int b, int c) {
        this(a, b); // Вызов конструктора A(int a, int b)
        this.c = c;
    }
}
