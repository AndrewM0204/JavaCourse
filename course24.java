public class course24 {
    public static void main(String[] args) {
        //1
        Integer value4 = Integer.decode("012");
        //2
        Boolean bool1 = Boolean.valueOf(true);
        Boolean bool2 = Boolean.valueOf("true");
        Boolean bool3 = true;
        Boolean bool4 = Boolean.TRUE;
        //3
        Boolean boolObj = null; // Объект равен null

        // Попытка автораспаковки
        try {
            boolean boolValue = boolObj; // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }
    }
}