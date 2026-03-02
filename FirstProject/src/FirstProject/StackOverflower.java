package FirstProject;

public class StackOverflower 
{
	static int val=0;
	public static void main(String args[])
	{
		System.out.println(val++);
		try 
		{
			main(null);
		}
		catch(StackOverflowError r)
		{
			System.out.println("End");
			return ;
		}
	}
}
