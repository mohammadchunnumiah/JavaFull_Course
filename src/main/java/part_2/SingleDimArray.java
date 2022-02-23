package part_2;

public class SingleDimArray {

	public static void main(String[] args) {

		System.out.println("---------Single dimentional array------------");
		
		// Single dimensional array declared with size 5
		int a[]= new int [5];
		
		a[0]=500;
		a[1]=100;
		a[2]=200;
		a[3]=300;
		a[4]=400;
		
		System.out.println("Single dimetional arrays output: " +a.length);
		System.out.println(a[2]);  // To Pick any specific element from array using index

		
		System.out.println("---------Read value from loop------------");
		
		// Declare an array without specifying size
		int b[] = { 10, 20, 30, 40, 50 };

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		
		// read values from enhanced for loop
		System.out.println("---------Read value from enhanced for loop------------");	
		int c[] = { 1, 2, 3, 4, 5 };
		
		for (int j:c) {
			System.out.println(j);
		}
	}
}
