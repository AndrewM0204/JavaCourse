public class course71 {
    public static void Positive(int age) {
        if (age < 0) {
            throw new IllegalArgumentException();
        }
    }
    public static void main(String[] args) {
        try {
            int result = 10 / 0;  // Деление на ноль
        } catch (ArithmeticException e) {
            System.out.println("Zero division");
        }
        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[5]);  // Индекс за пределами массива
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
        }
        try {
            Positive(-5);  // Неверный возраст
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal Argument");
        }
        Object obj = "Message";
        try {
            Integer num = (Integer) obj;  // Преобразование строки в число
        } catch (ClassCastException e) {
            System.out.println("Impossible to cast");
        }
        String str = null;
        try {
            System.out.println(str.length());  // Попытка вызова метода на null
        } catch (NullPointerException e) {
            System.out.println("Null Pointer");
        }
    }
}