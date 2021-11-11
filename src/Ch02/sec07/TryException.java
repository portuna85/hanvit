package Ch02.sec07;

public class TryException {
    public static void main(String args[]) {
        int divisor[] = {5, 4, 3, 2, 1, 0};
        for (int cnt = 0; cnt < 10; cnt++) {
            try {
                int share = 100 / divisor[cnt];
                System.out.println(share);
            } catch (java.lang.ArithmeticException e) {
                System.out.println("잘못되 연산입니다.");
            } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                System.out.println("잘못된 인덱스입니다.");
            }
        }
        System.out.println("Done");
    }
}
