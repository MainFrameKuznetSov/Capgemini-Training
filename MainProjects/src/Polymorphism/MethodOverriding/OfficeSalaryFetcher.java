package Polymorphism.MethodOverriding;

public class OfficeSalaryFetcher {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			
		Fresher fresher = new Fresher();
		System.out.println(fresher.monthlySalCalculator());
		ITFolk itfolk = new ITFolk();
		System.out.println(itfolk.monthlySalCalculator((byte)12));
		Supporting supporting = new Supporting();
		System.out.println(supporting.monthlySalCalculator((byte)15,20000));
	}
	
}
