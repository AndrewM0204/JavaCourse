import java.io.ByteArrayInputStream;

public class Main {
    public static void main(String[] args) {
        byte[] data = "Hello, InputStream!".getBytes();

        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        int byteData;
        while ((byteData = bais.read()) != -1) {
            System.out.print((char) byteData);
        }
    }
}
