package Ch02.sec06;

public class ContinueExam3 {
	public static void main(String[] args) {
		outerloop:
		for(int row=0; row<4;row++) {
			for(int col=0;col<6;col++) {
				if((row == 1 ) && (col == 3)) 
					continue outerloop;
				System.out.println("("+row+","+col+")");
			}
		}
		System.out.println("Done");
	}
}
