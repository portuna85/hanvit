package Ch02.sec06;

public class Excersise2_3 {

	public static void main(String[] args) {
		int arr[] = {2,4,6,8,10,12,14,16,18,20};
		int sum = 0;
		for(int cnt = 2; cnt<arr.length; cnt++) {
			if(arr[cnt] <= arr[7]) {
			sum += arr[cnt];
			}
		}
		System.out.println(sum);
	}
}