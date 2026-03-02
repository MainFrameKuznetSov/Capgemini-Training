package ArrayLogic;

public class TypesOfMatrix 
{
	
//	public static void printMatrix(int matrix[][])
//	{
//		
//	}
	
	public static boolean isColumnMatrix(int param[][])
	{
		for(int i=0;i<param.length;++i)
		{
			if(param[i].length!=1)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) 
	{
		
		int matrix[][]=null;
		try
		{
			if(isColumnMatrix(matrix))
				System.out.println("Column Matrix");
			else
				System.out.println("Not a column matrix.");
		}
		catch(NullPointerException exc)
		{
			System.out.println("Matrix cannot be null.");
		}
	}
	
	
	
}
