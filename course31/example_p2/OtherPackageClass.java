package example_p2; // В другом пакете

import example_p1.MainClass;

public class OtherPackageClass {
    public static void main(String[] args) {
        MainClass obj = new MainClass();

        System.out.println(obj.publicField);    // Доступно
        // System.out.println(obj.protectedField); // Ошибка: protectedField недоступно
        // System.out.println(obj.defaultField);   // Ошибка: defaultField недоступно
        // System.out.println(obj.privateField);   // Ошибка: privateField недоступно
    }
}

