package Arrays;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		System.out.println("Enter length:- ");
		int n=name.nextInt();
		name.nextLine();
		int array[]=new int[n];
		for(int i=0;i<n;++i)
		{
			System.out.println("Enter array["+i+"] :- ");
			array[i]=name.nextInt();
		}
		int l=0,r=n-1;
		while(l<r)
		{
			if(array[l++]!=array[r--])
			{
				System.out.println("Not palindrome.");
				return ;
			}
		}
		System.out.println("Palindrome.");
	}
}
