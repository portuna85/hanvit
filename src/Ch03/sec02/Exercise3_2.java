package Ch03.sec02;

public class Exercise3_2 {
    public static void main(String args[]) {
        Double num1=-12.375, num2=12.375;
        long num3 = Double.doubleToRawLongBits(num1);
        long num4 = Double.doubleToRawLongBits(num2);

        String str1 = Long.toBinaryString(num3);
        String str2 = Long.toBinaryString(num4);

        System.out.println(str1);
        System.out.println(str2);
    }
}
