package oops;

public class MethodOverloading {

	void tdata(int a, int b) 	//1
	{
		System.out.println(a + b);
	}

	void tdata(int a, int b, int c) 	//2
	{
		System.out.println(a + b + c);
	}

	void tdata(int a, double b) 	//3
	{
		System.out.println(a + b);
	}

	void tdata(double a, double b) 	//4
	{
		System.out.println(a + b);
	}

	void tdata(int a, int b, double c) 	//5
	{
		System.out.println(a + b + c);
	}

	
	
	public static void main(String[] args) {
		MethodOverloading ol = new MethodOverloading();
		ol.tdata(10, 20); // 1
		ol.tdata(10, 20, 30); // 2
		ol.tdata(10, 20.8); // 3
		ol.tdata(10.5, 10.9); // 4
		ol.tdata(10, 20, 25.9); // 5

	}

}
