public class course72 {
    public static void main(String[] args) {
        try {
            // Генерация первого исключения, которое будет перехвачено
            int result = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        try {
            // Генерация второго исключения, которое приведет к аварийной остановке программы
            String str = null;
            System.out.println(str.length()); // NullPointerException
        } catch (ArithmeticException e) {
            System.out.println("Это исключение перехвачено, но программа аварийно завершится после него.");
        }
    }
}
