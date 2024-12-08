class CustomException extends Exception {

    // Конструктор без параметров
    public CustomException() {
        super("Default error message");
    }

    // Конструктор с сообщением
    public CustomException(String message) {
        super(message);
    }

    // Конструктор с сообщением и причиной
    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }
}