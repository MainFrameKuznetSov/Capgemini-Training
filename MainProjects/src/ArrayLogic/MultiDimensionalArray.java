package ArrayLogic;

import java.util.Scanner;

public class MultiDimensionalArray 
{
	
	public static void main(String[] args) 
	{
		
		Scanner userInput=new Scanner(System.in);
		System.out.println("Enter number of elements:- ");
		int len=userInput.nextInt();
		userInput.nextLine();
		int matrix[][]=new int[len][len];
		for(int i=0;i<len;++i)
		{
			for(int j=0;j<len;++j)
			{
				System.out.println("Enter matrix["+i+"]["+j+"] :- ");
				matrix[i][j]=userInput.nextInt();
				userInput.nextLine();
			}
		}
		System.out.println("Matrix:- ");
		for(int i=0;i<len;++i)
		{
			for(int j=0;j<len;++j)
				System.out.print(matrix[i][j]+" ");
			System.out.println();
		}
		
	}

}
