package oops;

public class InheritanceChild {

	class A {
		int a;

		void display() {
			System.out.println(a);
		}
	}

	class B extends A {
		int b;

		void print() {
			System.out.println(b);
		}
	}

	public static void main(String[] args) {

		InheritanceParentA a = new InheritanceParentA();
		a.a = 100;
		a.display();

		InheritanceParentB b = new InheritanceParentB();
		b.y = 200;
		b.print();
	}

}
