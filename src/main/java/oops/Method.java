package oops;

public class Method {

	int x=10;
	int y=20;
	
	//Case1- not taking parameters and also not returned any value
	
	void sum()  
	{
		System.out.println(x+y);
	}  
	
	//Case2- not taking parameters but returning value
	/*int sum()  
	{
		return (x+y);
	} */
	
	//Case3- taking parameters, but not returning any value
	/* void sum(int a, int b) {
		System.out.println(a+b);
	}  */
	
	
	//Case4- method is taking parameters and also returning a value.
/*	int sum(int a, int b)  
	{
		return (a+b);
	}  */
	

	
	public static void main(String[] args) {
		Method cal=new Method();
		cal.sum();  // case1
//		System.out.println(cal.sum());  //Case2
//		cal.sum(100, 200);  //Case3
//		System.out.println(cal.sum(100, 200));  //Case4
		

	}

}
