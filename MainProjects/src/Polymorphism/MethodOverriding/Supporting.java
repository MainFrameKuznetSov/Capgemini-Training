package Polymorphism.MethodOverriding;

public class Supporting extends Fresher 
{
	double varPay=100000;
	
	@Override
	public double monthlySalCalculator()
	{
		return (basePay+varPay)/12;
	}
	
}
