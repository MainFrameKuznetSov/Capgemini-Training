package ArrayLogic;

public class ArrayFirst 
{
	
	public static void main(String[] args) 
	{
		
		Object[] arr=new Object[10];
		arr[0]=true;
		arr[1]=(byte)1;
		arr[2]='k';
		arr[3]="String";
		arr[4]=80980970879L;
		try 
		{
			arr[5]=true;
		}
		catch(Exception exc)
		{
			System.out.println("Not allowed.");
			System.out.println(exc.getMessage());
		}
		
		for(int i=0;i<arr.length;++i)
			System.out.println(arr[i]);
		
	}
	
}
