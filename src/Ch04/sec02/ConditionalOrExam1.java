package Ch04.sec02;

public class ConditionalOrExam1 {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0;
        if(++num1 > 0 | ++num2 > 0) {
            System.out.println("num1이 0보다 크고 num2가 0보다 큽니다.");
        } else {
            System.out.println("아닙니다.");
        }
        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);
    }
}
