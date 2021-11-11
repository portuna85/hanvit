package Ch02.sec05;

public class IfExam5 {

	public static void main(String[] args) {
		int num =152;
		
		if(num < 10) {
			System.out.println("num의 값은 10 미만입니다");
		} else if(num < 100) {
			System.out.println("num의 값은 10 이상 100 미만입니다");
		} else if(num < 1000) {
			System.out.println("num의 값은 100이상 1000 미만입니다");
		} else {
			System.out.println("num의 값은 1000 이상입니다");
		}

	}

}
