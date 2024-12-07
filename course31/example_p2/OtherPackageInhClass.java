package example_p2;

import example_p1.MainClass;

public class OtherPackageInhClass extends MainClass {
    public static void main(String[] args) {
        OtherPackageInhClass obj = new OtherPackageInhClass();

        System.out.println(obj.publicField);    // Доступно
        System.out.println(obj.protectedField); // Доступно через наследование
        // System.out.println(obj.defaultField); // Ошибка: defaultField недоступно
        // System.out.println(obj.privateField); // Ошибка: privateField недоступно
    }
}