package Quiz.Ch08;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTime {
    public static void main(String[] args) {
        GregorianCalendar obj = new GregorianCalendar();
        int year = obj.get(Calendar.YEAR);
        int month = obj.get(Calendar.MONTH)+1;
        int day = obj.get(Calendar.DAY_OF_MONTH);
        System.out.printf("오늘은 %d년 %d월 %d일 입니다.%n", year, month, day);
    }
}
