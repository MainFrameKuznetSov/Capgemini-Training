package Encapsulation;

public class HulkuAccount 
{
	private double bal=6000;
	private short pin=1019;
	
	public void setBalance(double bal,short pin)
	{
		if(this.pin!=pin)
		{
			System.out.println("Wrong PIN.");
			return ;
		}
		this.bal=bal;
		System.out.println("New Balance:- "+this.bal);
	}
	
	public void deposit(double amt,short pin)
	{
		if(this.pin!=pin)
		{
			System.out.println("Wrong PIN.");
			return ;
		}
		this.bal+=amt;
		System.out.println("New balance:- "+this.bal);
	}
	
	public void withdraw(double amt,short pin)
	{
		if(this.pin!=pin)
		{
			System.out.println("Wrong PIN.");
			return ;
		}
		if(this.bal<amt)
		{
			System.out.println("Not enough balance.");
			return ;
		}
		this.bal-=amt;
		System.out.println("New balance:- "+this.bal);
	}
	
	public double getBalance(short pin)
	{
		if(this.pin!=pin)
		{
			System.out.println("Wrong PIN.");
			return -0;
		}
		return this.bal;
	}
	
}
