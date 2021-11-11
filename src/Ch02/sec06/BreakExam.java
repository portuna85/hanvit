package Ch02.sec06;

public class BreakExam {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			System.out.println("break 밖 : "+i);
			if(i == 5) {
				System.out.println("break 안 : "+i);
				break;
			}
		}
		System.out.println("Done.");
	}
}