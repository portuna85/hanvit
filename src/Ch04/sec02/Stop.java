package Ch04.sec02;

public class Stop {
    public static void main(String args[]) {
        System.out.println(1234567890.9999999 < Double.POSITIVE_INFINITY);
        System.out.println(-7777777777.89 > Float.NEGATIVE_INFINITY);
        System.out.println(Float.NEGATIVE_INFINITY == Float.NEGATIVE_INFINITY);

        System.out.println(1234567890.99999999 < Double.NaN);
        System.out.println(-7777777777.89 > Double.NaN);
        System.out.println(Double.NaN == Double.NaN);

        System.out.println(1234567890.99999999 != Double.NaN);
        System.out.println(-7777777777.89 != Double.NaN);
        System.out.println(Double.NaN != Double.NaN);
    }
}