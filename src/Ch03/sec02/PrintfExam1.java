package Ch03.sec02;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class PrintfExam1 {
    public static void main(String args[]) {
        System.out.printf("% + d%/n", 10);
        System.out.printf("% + d%/n", -10);
        System.out.printf("가격 : %, d원/n", 10);
        Calendar now = new GregorianCalendar();
        System.out.printf("%1$tY/%1$tm/%1td %1$tH:%1$tM:%1$tS %n", now);
        System.out.printf("%1$tY년%1$tm월%1$td일 %1$tH시%1tM분%1tS초 %n", now);
        System.out.printf(Locale.US, "%tc %n", now);
    }
}
