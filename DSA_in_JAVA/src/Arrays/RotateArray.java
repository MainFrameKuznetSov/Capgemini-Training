package Arrays;

import java.util.Scanner;

public class RotateArray 
{
	
	public static void rotate(int l,int r,int array[])
	{
		while(l<r)
		{
			int temp=array[l];
			array[l]=array[r];
			array[r]=temp;
			++l;
			--r;
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner name = new Scanner(System.in);
		System.out.println("Enter length:- ");
		int len=name.nextInt();
		name.nextLine();
		int array[]=new int[len];
		for(int i=0;i<len;++i)
		{
			System.out.println("Enter array["+i+"]:- ");//{1,2,3,4,5}
			array[i]=name.nextInt();
			name.nextLine();
		}
		System.out.println("Enter rotation places:- ");
		int pos=name.nextInt();//3
		name.nextLine();
		System.out.println("Array before rotation:- ");
		for(int i:array)
			System.out.print(i+" ");
		System.out.println();
		System.out.println("Array after rotation:- ");
		rotate(0,len-1,array);//5 4 3 2 1
		rotate(0,pos-1,array);//4 5 3 2 1
		rotate(pos,len-1,array);//4 5 1 2 3
//		rotate(len-pos,len-1,array);
		for(int i:array)
			System.out.print(i+" ");
		System.out.println();
	}
	
}
