package example_p1;

public class SamePackageClass {
    public static void main(String[] args) {
        MainClass obj = new MainClass();

        System.out.println(obj.publicField);    // Доступно
        System.out.println(obj.protectedField); // Доступно
        System.out.println(obj.defaultField);   // Доступно
        // System.out.println(obj.privateField); // Ошибка: privateField недоступно
    }
}