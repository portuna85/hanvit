package Ch02.sec07;

public class Exercise2_6 {
    public static void main(String args[]) {
        int total = 0;
        try {
            for(String str : args) {
                int num = Integer.parseInt(str);
                total += num;
            }
            System.out.println(total);
        } catch (java.lang.NumberFormatException e) {
            System.out.println("명령행 파라미터로 정수 입력 가능");
        }

    }
}
