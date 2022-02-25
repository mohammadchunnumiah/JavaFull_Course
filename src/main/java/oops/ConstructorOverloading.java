package oops;

public class ConstructorOverloading {
	
	
	ConstructorOverloading(int a, int b) //1
	{
		System.out.println("Constructor overloading-1: " +(a+b));
	}
	
	ConstructorOverloading(double a, int b)  //2
	{
		System.out.println("Constructor overloading-2: " +(a+b));
	}
	
	ConstructorOverloading(int a, double b) //3
	{
		System.out.println("Constructor overloading-3: " +(a+b));
	}
	
	ConstructorOverloading(int a, int b, int c)  //4
	{
		System.out.println("Constructor overloading-4: " +(a+b+c));
	}
	
	
	public static void main(String[] args) {

		ConstructorOverloading co1=new ConstructorOverloading(10, 20);  //1
		ConstructorOverloading co2=new ConstructorOverloading(15.3, 20);  //2
		ConstructorOverloading co3=new ConstructorOverloading(10, 20.5);  //3
		ConstructorOverloading co4=new ConstructorOverloading(10, 20, 30);  //4
		

	}

}
