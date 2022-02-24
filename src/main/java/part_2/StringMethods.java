package part_2;

public class StringMethods {

	public static void main(String[] args) {
		String s="Welcome";
		String s1=" to Java";
		
		System.out.println("Total length of string: " +s.length()); // to find length of a string
		System.out.println(s.concat(s1));  // joining of strings
		
		s="      Welcome           ";
		System.out.println("Before trim of string: " +s);
		System.out.println("After trim of string: " +s.trim());  // trim blank spaces of a string
		
		//charAt()
		s="Hello World";
		System.out.println(s.charAt(6));

		//contains()  --> returns true
		System.out.println(s.contains("Hel"));
		System.out.println(s.contains("hel"));
		System.out.println(s.contains("orld"));
		
		
		//comparing strings equals()
		s="Welcome";
		System.out.println(s.equals("Welcome"));  // true
		System.out.println(s.equals("Wel  come"));  //false
		System.out.println(s.equals("welcome")); //false
		
		//Ignore case
		System.out.println(s.equalsIgnoreCase("Welcome")); // true
		
		//Replacing characters
		s="Welcome to Java World";
		System.out.println(s.replace("Java", "Python"));
		
		//extracting substring fro the main string
		s="Welcome to Java";
		System.out.println(s.substring(0, 3));  //Welcome
		
		//converting case
		s="Welcome";
		System.out.println(s.toLowerCase()); // will convert into lower case as "welcome"
		System.out.println(s.toUpperCase()); // will convert into UPPER case as "welcome"
		
	}

}
