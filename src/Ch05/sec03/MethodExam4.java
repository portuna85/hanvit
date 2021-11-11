package Ch05.sec03;

public class MethodExam4 {
    public static void main(String[] args) {
        int arr[] = new int[0];             // 길이가 0인 배열 생성
        
        Number num = new Number(arr);
        try {
            int average = num.getAverage();
            System.out.println("평균 : "+average);
        } catch (java.lang.ArithmeticException e) {
            System.out.println("평균 계산도중 에러발생");
        }
    }
}
