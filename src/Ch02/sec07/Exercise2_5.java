package Ch02.sec07;

public class Exercise2_5 {
    public static void main(String args[]) {
        int total = 0;
        for(String str : args) {
            int num = Integer.parseInt(str);
            total += num;
        }
        System.out.println(total);
    }

}
