package Ch02.sec07;

public class MethodExam1 {
	public static void main(String[] args) {
		printCharacter('*', 30);
		System.out.println("Hello, JAVA!");
		printCharacter('-', 30);
	}
	
	static void printCharacter(char ch, int num) {
		for(int cnt=0;cnt<num;cnt++) {
			System.out.println(ch);
		}
		System.out.println();
		return;
	}
}