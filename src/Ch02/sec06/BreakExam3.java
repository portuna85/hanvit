package Ch02.sec06;

public class BreakExam3 {

	public static void main(String[] args) {
		outerLoop:
			for(int row = 0; row <4 ; row++) {
				for(int col = 0; col < 5; col++) {
					System.out.println("(" + row + ","+col+")");
					if((row == 1) && (col == 3))
						break outerLoop;						
				}
			}
			System.out.println("Done");
		}

	}