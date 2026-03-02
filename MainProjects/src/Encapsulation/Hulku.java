package Encapsulation;

public class Hulku 
{
	
	public static void main(String[] args) 
	{
		HulkuAccount hulAcc = new HulkuAccount();
		short pin=1019;
		System.out.println(hulAcc.getBalance(pin));
	}
	
}
