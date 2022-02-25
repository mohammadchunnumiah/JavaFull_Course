package oops;

public class OverloadingMainMethod {
	
	public void main (int a)  //1
	{
		System.out.println(a);
	}
	
	public void main (int a, int b)  //2
	{
		System.out.println(a+b);
	}
	
	public void main (int a, double b)  //3
	{
		System.out.println(a+b);
	}
	
	

	public static void main(String[] args) {
		OverloadingMainMethod ol = new OverloadingMainMethod();
		ol.main(100);
		ol.main(100, 200);
		ol.main(100, 200.5);

	}

}
