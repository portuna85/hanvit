package Ch07.sec02;

public class EnumExam3 {
    public static void main(String[] args) {
        printSeason(Season.SPRING);
        printSeason(Season.SUMMER);
        printSeason(Season.FALL);
        printSeason(Season.WINTER);
    }
    static void printSeason(Season season) {
        System.out.println(season.value());
    }
}