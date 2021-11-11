package Ch05.sec03;

public class MethodEx2 {
    public static void main(String[] args) {
        int arr[] = {90, 75, 85, 94, 83, 72, 88, 98};
        Number num =new Number(arr);
        int total = num.getTotal();
        int average = num.getAverage();

        System.out.println("합계 = " + total);
        System.out.println("평균 = " + average);
    }
}
