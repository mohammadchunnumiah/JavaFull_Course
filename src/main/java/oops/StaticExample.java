package oops;

public class StaticExample {

	static int a=10;  //static variable
	int b=20;
	
	static void m1()  // static method
	{
		System.out.println("this is m1 - static method");
	}
	
	void m2()  // not static method
	{
		System.out.println("this is m2 - not static method");
	}
	
	void m3()
	{
		System.out.println("This is m3 method ------- Non--static");
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
		 
	
	
	public static void main(String[] args) {
		//static methods can access only static elements
		System.out.println(a);
		m1();
		
		//static methods can also access not static stuff but through object creation
		StaticExample obj = new StaticExample();
		System.out.println(obj.b);  //not static variable through object
		obj.m2(); // non static method through object
		
		obj.m3();
	}

}
