package Ch02.sec06;

public class ContinueExam2 {
	public static void main(String[] args) {
		int cnt=0;
		loop:
		while(cnt<10) {
			if(cnt == 5) {
				continue loop;
			}
			System.out.println(cnt);
			cnt++;
		}
		System.out.println("Done.");
	}

}
