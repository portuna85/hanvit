package Ch04.sec02;

public class IncDecExam2 {
    public static void main(String args[]) {
        int a = 2, b = 3, result;
        result = ++a + --b *  a--;              // 1. ++a 2. --b 3. a=3Xb=2 4. a=3 5. a
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("result = " + result);
    }
}
