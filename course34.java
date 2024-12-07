public class course34 {
    static public void printValues(String message, int... numbers) {
        System.out.print("Message: " + message + ", Numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        course34.printValues("Numbers are", 1, 2, 3, 4, 5);
    }
}
