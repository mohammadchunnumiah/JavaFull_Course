package part_1;

public class WhileLoops {

	public static void main(String[] args) {

		System.out.println("--------Ascending order------------");
		// Ascending order
		int i = 1;

		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		System.out.println("----------Descending order---------");
		// Descending order
		int j = 10;
		while (j > 0) {
			System.out.println(j);
			j--;
		}

		System.out.println("----------EVEN Number----------");
		// Print EVEN number using while ... loop
		int k = 2;
		while (k <= 10) {
			System.out.println(k);
			k += 2; // or k=k+2
		}
		System.out.println("--------ODD number------------");

		// Print ODD number using while ... loop
		int l = 1;
		while (l <= 10) {
			System.out.println(l);
			l += 2; // or l=l+2
		}
	}
}
