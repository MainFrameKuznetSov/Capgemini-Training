package Polymorphism.MethodOverriding;

public class ITFolk extends Fresher 
{
	double varPay=200000;
	
	@Override
	public double monthlySalCalculator()
	{
		return (basePay+varPay)/12;
	}
}
