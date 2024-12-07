class Animal {
    // Метод суперкласса
    public void sound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    // Переопределение метода
    @Override
    public void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    // Переопределение метода
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}

public class OverridingExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.sound(); // Вывод: Bark
        myCat.sound(); // Вывод: Meow
    }
}
