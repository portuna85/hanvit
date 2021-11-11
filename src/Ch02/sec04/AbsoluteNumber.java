package Ch02.sec04;

public class AbsoluteNumber {

	public static void main(String[] args) {
		int num = -125;
		int abs = num;
		if (num < 0) {
		//	int abs = num;
			abs  = -abs;
		}
		System.out.println(abs);
	}
}