package Encapsulation;

public class Chomu 
{
	
	public static void main(String[] args) 
	{
		HulkuAccount hulAcc = new HulkuAccount();
		short pin=9019;
		System.out.println(hulAcc.getBalance(pin));
	}
	
	class ChomuKaBachha
	{
		public int rate=10;
	}
	
}
