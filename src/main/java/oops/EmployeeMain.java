package oops;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.eid=101;
		emp1.ename="David";
		emp1.sal=25000.00;
		emp1.deptno=10;
		emp1.position="Manager";
		
		emp1.display();
	
		System.out.println("---------------------------------------");
		
		Employee emp2 = new Employee();
		emp2.eid=102;
		emp2.ename="John";
		emp2.sal=55000.00;
		emp2.deptno=20;
		emp2.position="CEO";

		emp2.display();
	}

}
