package Ch02.sec07;

public class MethodExam2 {
    public static void main(String args[]) {
        int result = add(4,2);
        System.out.println(result);
    }
    static int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
}