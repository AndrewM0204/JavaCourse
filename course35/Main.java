class EnumInitializationExample {

    // Определение перечисления с инициализацией
    public enum Day {
        MONDAY("Work day"),
        TUESDAY("Work day"),
        WEDNESDAY("Work day"),
        THURSDAY("Work day"),
        FRIDAY("Work day"),
        SATURDAY("Day off"),
        SUNDAY("Day off");

        // Поле для хранения описания
        private final String description;

        // Конструктор перечисления
        Day(String description) {
            this.description = description;
        }

        // Метод для получения описания
        public String getDescription() {
            return description;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Пример использования перечисления
        for (EnumInitializationExample.Day day : EnumInitializationExample.Day.values()) {
            System.out.println(day + ": " + day.getDescription());
        }
    }
}
