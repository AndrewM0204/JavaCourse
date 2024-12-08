class Person {
    private String name;
    private int age;

    // Конструктор
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Переопределённый метод equals()
    @Override
    public boolean equals(Object obj) {
        // Проверка на идентичность ссылок. Объект всегда должен быть равен самому себе.
        if (this == obj) {
            return true;
        }

        // Проверка типа объекта
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Преобразование объекта к типу Person
        Person person = (Person) obj;

        // Сравнение значений полей
        return this.age == person.age && this.name.equals(person.name);
    }
}

public class course44 {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Alice", 25);
        Person p3 = new Person("Bob", 30);

        System.out.println(p1.equals(p2)); // true, потому что у p1 и p2 одинаковое имя и возраст
        System.err.println(p2.equals(p1)); // Если x.equals(y) возвращает true, то y.equals(x) также должно возвращать true.
        System.out.println(p1.equals(p3)); // false, потому что у p1 и p3 разные имена и/или возраст
        System.out.println(p1.equals(null)); // Метод equals() должен возвращать false, если объект, с которым сравнивается, равен null.
    }
}
