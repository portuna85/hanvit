package Ch04.Vitamin.Quiz;

public class ConditionalOpExam2 {
    public static void main(String[] args) {
        int a = 20, b =30, max;
        max = a < b ? ++a : ++b;
        System.out.println(max);
        System.out.println(a);
        System.out.println(b);
    }
}
