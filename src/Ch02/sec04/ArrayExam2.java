package Ch02.sec04;

public class ArrayExam2 {

	public static void main(String[] args) {
		int table[][] = new int [3][4];
		table[0][0] = 10;
		table[1][2] = 20;
		table[2][2] = table[0][0] + table[1][2];
		table[2][1] = table[0][0] + table[1][1];
		System.out.println(table[0][0]);
		System.out.println(table[1][2]);
		System.out.println(table[2][2]);
		System.out.println(table[2][1]);
		System.out.println(table[1][1]);
	}
}