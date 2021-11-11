package Ch03.sec02;

public class TypeExam2 {
    public static void main(String args[]) {
        double result1, result2;
        float num1, num2;

        result1 = 2.0 / 0.0;
        result2 = 2.0 / -0.0;

        num1 = 2 / 0;
        num2 = 2 / -0;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(num1);
        System.out.println(num2);
    }
}
