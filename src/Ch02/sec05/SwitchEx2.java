package Ch02.sec05;

public class SwitchEx2 {

	public static void main(String[] args) {
		char ch = 'p';
		
		switch(ch) {
		case 'A':
		case 'a':
			System.out.println("사과");
			break;
		case 'P':
		case 'p':
			System.out.println("배");
			break;
		case 'G':
		case 'g':
			System.out.println("포도");
			break;
		default :
			System.out.println("Done");
			break;
		}

	}

}