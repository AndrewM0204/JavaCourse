enum Season {
    WINTER("Cold and snowy"),
    SPRING("Warm and rainy"),
    SUMMER("Hot and sunny"),
    FALL("Cool and windy");

    private final String description;

    // Конструктор перечисления
    Season(String description) {
        this.description = description;
    }

    // Метод для получения описания сезона
    public String getDescription() {
        return description;
    }
}

public class Main2 {
    public static void main(String[] args) {
        for (Season season : Season.values()) {
            System.out.println(season + ": " + season.getDescription());;
        }
    }
}
