
class MyResource implements AutoCloseable {
    @Override
    public void close() {
        System.out.println("Res Closed");
    }

    public void doSomething() {
        System.out.println("Work with res");
        throw new RuntimeException("Some error");
    }
}

public class Main2 {
    public static void main(String[] args) {
        try (MyResource resource = new MyResource()) {
            resource.doSomething();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
