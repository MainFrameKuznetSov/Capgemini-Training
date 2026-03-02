package Arrays;

import java.util.Scanner;

public class DeleteBasedOnElement 
{
	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		System.out.println("Enter length:- ");
		int len=name.nextInt();
		name.nextLine();
		int array[]=new int[len];
		for(int i=0;i<len;++i)
		{
			System.out.println("Enter array["+i+"]:- ");
			array[i]=name.nextInt();
			name.nextLine();
		}
		System.out.println("Enter element you want to delete:- ");
		int ele=name.nextInt();
		name.nextLine();
		int adjust=0;
		for(int i=0;i<len;++i)
		{
			if(array[i]==ele)
			{
				++adjust;
				continue;
			}
			array[i-adjust]=array[i];
		}
		for(int i=0;i<(len-adjust);++i)
			System.out.print(array[i]+" ");
		System.out.println();
	}
}
