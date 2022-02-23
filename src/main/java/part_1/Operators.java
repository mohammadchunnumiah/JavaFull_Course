package part_1;

public class Operators {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		// Arithmetic operators --> 
			//  +  --> Additive operator (also used for String concatenation)
			//  -  --> Subtraction operator
			//  *  --> Multiplication operator
			//  /  --> Division operator
			//  %  --> Reminder operator
		
		System.out.println("-------Arithmetic Operators");
		System.out.println("Sum of a and b is: " + (a + b));
		System.out.println("Diff of a and b is: " + (b - a));
		System.out.println("Mul of a and b is: " + (a * b));
		System.out.println("Mul of a and b is: " + (a % b));

		// Relational Operators (Comparison operators) --> == <> <= >= !=
		// Always retrun boolean value
		System.out.println("-------Relational Operators");
		System.out.println(a == b); // false
		System.out.println(a > b); // false
		System.out.println(a < b); // true
		System.out.println(a >= b); // false
		System.out.println(a <= b); // true
		System.out.println(a != b); // true

		// Logical Operators
		// x y x & y x || Y !=
		// TRUE TRUE TRUE TRUE FALSE
		// TRUE FALSE FALSE TRUE
		// FALSE TRUE FALSE TRUE TRUE
		// FALSE FALSE FALSE FALSE

		boolean x = true;
		boolean y = false;
		System.out.println("-------Logical Operators");
		System.out.println(x && y); // false
		System.out.println(x || y); // true
		System.out.println(!x); // false
		System.out.println(!y); // true

		// Increment & decrement operators ++ --

		int a1 = 10;
		a1++; // or a+1;
		System.out.println(a1);

		int b1 = 20;
		b1--; // or b-1;
		System.out.println(b1);

	}

}
