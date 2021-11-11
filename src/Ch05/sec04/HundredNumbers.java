package Ch05.sec04;

public class HundredNumbers {
    static int arr[];
    static {
        arr = new int[100];
        for(int cnt=0;cnt<100;cnt++) {
            arr[cnt] = cnt;
        }
    }
}
