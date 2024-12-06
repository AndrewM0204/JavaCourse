import java.io.PrintStream;

public class course21 {
    public static void main(String[] args) {
        // 1
        int a1 = 0;
        long a2 = 1;
        byte a3 = -1;
        short a4 = 2;
        float a5 = 0;
        double a6 = 1.0;
        char a7 = 'a';
        boolean a8 = true;
        // 2
        String name = "Андрей";
        try {
            System.setOut(new PrintStream(System.out, true, "UTF-8"));
        } catch (Exception e) {
        }
        System.out.println(name);
        // 4
        String x = "aaaa";
        String y = "bbbb";
        System.out.println(x + y);
        long c = a1+a2;
        //5 variable a5 is converted to double
        double f = a6 + a5;
        //6
        byte b = (byte)a6;
        int a = 120;
        byte c1 = (byte)(a + 10);
        System.out.printf("%d", c1);
    }
}