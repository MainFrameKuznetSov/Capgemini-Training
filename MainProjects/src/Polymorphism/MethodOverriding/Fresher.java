package Polymorphism.MethodOverriding;

public class Fresher {
	double basePay=300000;
	
	public double monthlySalCalculator()
	{
		return (basePay/12);
	}
	
	public double monthlySalCalculator(byte months)
	{
		return (basePay/12)*months;
	}
	
	public double monthlySalCalculator(byte months,double bonus)
	{
		return monthlySalCalculator(months)+bonus;
	}
	
}
