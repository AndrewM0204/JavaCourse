class Parent {
    public void showMessage() {
        System.out.println("Message from Parent");
    }
}

class Child extends Parent {
    @Override
    public void showMesage() { // Ошибка: метод "showMesage" не переопределяет метод суперкласса
        System.out.println("Message from Child");
    }
}
