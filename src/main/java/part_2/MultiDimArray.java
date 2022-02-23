package part_2;

public class MultiDimArray {

	public static void main(String[] args) {

		int a[][] = new int[3][2];

		a[0][0] = 100;
		a[0][1] = 200;

		a[1][0] = 300;
		a[1][1] = 400;

		a[2][0] = 400;
		a[2][1] = 500;

		// int a [][]= { {100,200}, {200,300}, {400,500}};

		System.out.println("Number of rows: " + a.length);
		System.out.println("Number of columns: " + a[0].length);

		// using classic for loop
		/*
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				System.out.println(a[1][col]);
			}
		} */
	
		
		// using enhanced foor loop
		for (int row[] : a) {
			for (int col : row) {
				System.out.println(col);
			}
		}
	}
}
