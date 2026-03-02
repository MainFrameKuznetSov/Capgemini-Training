package Arrays;

import java.util.Scanner;

public class InsertAtIndex 
{
	
	public static void trial(int[][] arr1)
	{
		for(int i=0;i<3;++i)
		{
			for(int j=0;j<3;++j)
				arr1[i][j]=3;
		}
	}
	
	public static void main(String[] args) {
		int array[]= {1,2,3,4,5};
		for(int i=0;i<array.length;++i)
			System.out.print(array[i]+" ");
		System.out.println();
		//Insert 30 at position 2
		Scanner name = new Scanner(System.in);
//		System.out.println("Enter element you want to insert:- ");
//		int ele=name.nextInt();
//		name.nextLine();
		System.out.println("Enter index where you want to delete:- ");
		int ind=name.nextInt();
		if(ind>=5)
		{
			System.out.println("Not possible");
			return ;
		}
		name.nextLine();
		int newArr[]=new int[array.length-1];
//		for(int i=0;i<ind;++i)
//		{
//			System.out.println(i);
//			newArr[i]=array[i];
//		}
//		newArr[ind]=ele;
//		for(int i=ind+1;i<newArr.length;++i)
//			newArr[i]=array[i-1];
		for(int i=ind;i<array.length-1;++i)
			array[i]=array[i+1];
		array[4]=0;
		for(int i=0;i<array.length-1;++i)
			System.out.print(array[i]+" ");
		System.out.println();
		int[][] arr=new int[3][3];
		trial(arr);
		for(int i=0;i<arr.length;++i)
		{
			for(int j=0;j<arr[0].length;++j)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
		
	}
	
}
