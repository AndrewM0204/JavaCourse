package example_p1;

public class MainClass {
    public String publicField = "Public Field";
    protected String protectedField = "Protected Field";
    String defaultField = "Default Field";
    private String privateField = "Private Field";

    public static void main(String[] args) {
        MainClass obj = new MainClass();

        // Все поля доступны внутри того же класса
        System.out.println(obj.publicField);    // Public Field
        System.out.println(obj.protectedField); // Protected Field
        System.out.println(obj.defaultField);   // Default Field
        System.out.println(obj.privateField);   // Private Field
    }
}
