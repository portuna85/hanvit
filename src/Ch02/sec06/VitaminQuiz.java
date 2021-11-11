package Ch02.sec06;

public class VitaminQuiz {
	public static void main(String args[]) {
		int arr[] = {10, 20, 30, 40, 50};
		for(int cnt = 0; cnt<arr.length; cnt++) {
			arr[cnt] *= 10;
		}
		for(int cnt=0; cnt<arr.length; cnt++) {
			System.out.println(arr[cnt]);
		}
		System.out.println("Done.");
	}
}
