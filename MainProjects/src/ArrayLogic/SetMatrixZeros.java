package ArrayLogic;

//import java.util.ArrayList;
import java.util.Scanner;

class Coordinate
{
	public int row,col;
	
	Coordinate()
	{
		this.row=0;
		this.col=0;
	}
	
	Coordinate(int row,int col)
	{
		this.row=row;
		this.col=col;
	}
	
}

public class SetMatrixZeros 
{
	
	static Coordinate[] zeroCatcher=new Coordinate[9];
	static int zeroIndex=0;
	
	public static void zeroMaker(int matrix[][])
	{
		int rowLen=matrix.length,colLen=matrix[0].length;
		Coordinate zeroLoc = new Coordinate();
		for(int i=0;i<rowLen;++i)
		{
			for(int j=0;j<colLen;++j)
			{
				if(matrix[i][j]==0)
					zeroCatcher[zeroIndex++]=new Coordinate(i,j);
			}
		}
		
//		System.out.println(zeroLoc.row+" "+zeroLoc.col);
		for(int top=0;top<zeroIndex;++top)
		{
			for(int i=0;i<rowLen;++i)//top->bottom
				matrix[zeroCatcher[top].row][i]=0;
			for(int i=0;i<colLen;++i)//left->right
				matrix[i][zeroCatcher[top].col]=0;
		}
		
		for(int i=0;i<rowLen;++i)
		{
			for(int j=0;j<colLen;++j)
				System.out.print(matrix[i][j]+" ");
			System.out.println();
		}
			
	}
	
	public static void printMatrix(int matrix[][])
	{
		
		int rowLen=matrix.length,colLen=matrix[0].length;
		for(int i=0;i<rowLen;++i)
		{
			for(int j=0;j<colLen;++j)
				System.out.print(matrix[i][j]+" ");
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) 
	{
		
//		Scanner userInput=new Scanner(System.in);
//		System.out.println("Enter no. of rows");
//		int rowLen=userInput.nextInt();
//		userInput.nextLine();
//		System.out.println("Enter no. of columns");
//		int colLen=userInput.nextInt();
//		userInput.nextLine();
		int matrix[][]= {
							{1,1,3},
							{2,0,0},
							{1,2,0}
						};
		System.out.println("Orginal Matrix...");
		try 
		{
			printMatrix(matrix);
		}
		catch(NullPointerException ex)
		{
			System.out.println("Null Matrix not allowed");
		}
		System.out.println();
		System.out.println("After setting zeros...");
		try 
		{
			zeroMaker(matrix);
		}
		catch(NullPointerException ex)
		{
			System.out.println("Null Matrix not allowed");
		}
		
	}
	
}
