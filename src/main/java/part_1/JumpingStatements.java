package part_1;

public class JumpingStatements {

	public static void main(String[] args) {

		// using break
		for (int i = 1; i <= 10; i++) {
			if (i == 6) {
				break;
			}
			System.out.println(i);
		}

		System.out.println("--------------------------------");

		// using continue to skip some number
		for (int j = 1; j <= 10; j++) {
			if (j == 5) {
//			if (j == 5 || j == 6 || j == 8) {    //this time will skip 5, 6, 7
				continue;
			}
			System.out.println(j);
		}

	}

}
