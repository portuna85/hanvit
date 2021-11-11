package Ch04.sec02;

public class EqualityExam2 {
    public static void main(String args[]) {
        double num1 = 1.1 + 2.2;
        double num2 = 3.3;
        
        if(num1 == num2) {
            System.out.println("결과가 같음111");
        } else {
            System.out.println("결과가 다름111");
        }

        if(num1 != num2) {
            System.out.println("결과가 다름222");
        } else {
            System.out.println("결과가 같음222");
        }
    }
}
