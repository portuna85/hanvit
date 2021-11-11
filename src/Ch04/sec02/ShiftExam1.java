package Ch04.sec02;

public class ShiftExam1 {
    public static void main(String[] args) {
        int num = 0xFF00FF01;
        int result1 = num << 3;
        int result2 = num >> 3;
        int result3 = num >>> 3;

        System.out.printf("%08X %n", result1);
        System.out.printf("%08X %n", result2);
        System.out.printf("%08X %n", result3);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}
