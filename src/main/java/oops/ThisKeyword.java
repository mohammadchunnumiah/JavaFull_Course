package oops;

public class ThisKeyword {
	
	int a, b;	// class variable or instance variables
	
	void getValues(int a, int b) // method variables or external variables
	{
		this.a=a;
		this.b=b;
	}
	
	void printValues() 
	{
		System.out.println(a);
		System.out.println(b);
	}
	 	

	public static void main(String[] args) {
		
		ThisKeyword tk = new ThisKeyword();
		tk.getValues(100, 200);
		tk.printValues();
	

	}

}
