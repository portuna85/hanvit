package Ch08.sec02;

public class AccessControlExam1 {
    public static void main(String[] args) {
        Fraction obj = new Fraction(200, 3);

        // System.out.println("200/3 = " + obj.getDouble());

        System.out.println("200/3 = "+obj.getDoouble());
    }
}
