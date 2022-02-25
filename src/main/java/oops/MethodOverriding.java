package oops;

public class MethodOverriding {

	static class Bank {
		double rateOfInterest() 
		{
			return 0;
		}
	}

	static class SBI extends Bank {
		double rateOfInterest() 
		{
			return 10.5;
		}
	}

	static class ICICI extends Bank {
		double rateOfInterest() 
		{
			return 8.0;
		}
	}

	static class AXIS extends Bank {
		double rateOfInterest() 
		{
			return 5.2;
		}
	}
	
	

	public static void main(String[] args) {
		
//		Bank bank = new Bank();
//		System.out.println(bank.rateOfInterest());

		SBI sbi = new SBI();
		System.out.println(sbi.rateOfInterest());

		ICICI icici = new ICICI();
		System.out.println(icici.rateOfInterest());

		AXIS axis = new AXIS();
		System.out.println(axis.rateOfInterest());

	}

}
