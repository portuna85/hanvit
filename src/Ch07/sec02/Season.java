package Ch07.sec02;

public enum Season {
    SPRING("봄"), SUMMER("여름"), FALL("가을"), WINTER("겨울");
    final private String name;
    Season (String name) {
        this.name = name;
    }
    String value() {
        return name;
    }
}
