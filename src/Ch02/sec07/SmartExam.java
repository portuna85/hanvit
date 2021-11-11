package Ch02.sec07;

public class SmartExam {
    public static void main(String args[]) {
        int a = 3, b = 0;
        int result;
        try {
            result = a / b;
            System.out.println(result);

        } catch (java.lang.ArithmeticException e) {
            System.out.println("잘못된 연산입니다.");
        }
        System.out.println("Done");
    }
}
