package Ch07.sec02;

public class ClothInfo {
    enum Season {
        SPRING, SUMMER, FALL, WINTER
    }
    String code;
    String name;
    String material;
    Season season;


    ClothInfo(String code, String name, String material, Season season) {
        this.code = code;
        this.name = name;
        this.material = material;
        this.season = season;
    }
}