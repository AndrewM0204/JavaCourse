class Parent {
    public Number getValue() {
        return 42;
    }
}

class Child extends Parent {
    @Override
    public Integer getValue() { // Integer — подкласс для Number
        return 42;
    }
}

class Parent1 {
    public Number getValue() {
        return 42;
    }
}

class Child1 extends Parent1 {
    @Override
    public String getValue() { // Ошибка компиляции: String не является подклассом Number
        return "42";
    }
}
