package Quiz.Ch07;

public class DayPrint {
    public static void main(String[] args) {
        printSeason(Day.MONDAY);
        printSeason(Day.TUESDAY);
        printSeason(Day.WEDNESDAY);
        printSeason(Day.THURSDAY);
        printSeason(Day.FRIDAY);
        printSeason(Day.SATURDAY);
        printSeason(Day.SUNDAY);


    }
    static void printSeason(Day day) {
        System.out.println(day.value());
    }
}
