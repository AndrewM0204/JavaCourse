enum Day { MONDAY, TUESDAY, WEDNESDAY };

public class course26 {
    public static void main(String[] args) {
        int number = 2;
        switch (number) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Other");
                break;
        }
        char letter = 'A';
        switch (letter) {
            case 'A':
                System.out.println("Letter is A");
                break;
            case 'B':
                System.out.println("Letter is B");
                break;
            default:
                System.out.println("Other letter");
                break;
        }
        Day day = Day.TUESDAY;
        switch (day) {
            case MONDAY:
                System.out.println("It's Monday");
                break;
            case TUESDAY:
                System.out.println("It's Tuesday");
                break;
            default:
                System.out.println("Other day");
                break;
        }
        String fruit = "Apple";
        switch (fruit) {
            case "Apple":
                System.out.println("It's an apple");
                break;
            case "Banana":
                System.out.println("It's a banana");
                break;
            default:
                System.out.println("Unknown fruit");
                break;
        }
    }
}