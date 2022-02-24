package oops;

public class Constructor {

	int x;
	int y;

	Constructor() // default constructor
	{
		this.x = 10;
		this.y = 20;
	}

	void output() 
	{
		System.out.println(x+y);
		//System.out.println("Default constructor value: " +(x + y));
	}
	
	
	Constructor(int a, int b) // parameterization constructor
	{
		this.x = a;
		this.y = b;
	}

	void output2() 
	{
		System.out.println(x+y);
		//System.out.println("Parameterized constructor value: " +(x + y));
	}
	
	

	public static void main(String[] args) {
		Constructor cons = new Constructor(); //Invokes default constructor
		cons.output();
		
		Constructor cons2 = new Constructor(100, 200); // parameterized constructor
		cons2.output2();
		
		

		
		
		
	}

}
