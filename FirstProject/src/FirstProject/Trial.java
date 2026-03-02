package FirstProject;

import java.util.Scanner;

class Pair
{
	public int first,second;
	
	Pair()
	{
		this.first=0;
		this.second=0;
	}
	
	Pair(int first,int second)
	{
		this.first=first;
		this.second=second;
	}
}

public class Trial {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter month:- ");
		byte month = userInput.nextByte();
		userInput.nextLine();
		System.out.println("Enter year:- ");
		short year = userInput.nextShort();
		userInput.nextLine();
//		int i=1;
//		for(System.out.println("30 days");;System.out.println("31 days"))
//		{
//			System.out.println("28 days");
//		}
		
		do
		{
			System.out.println("28 days");
		}
		while(false);
		
//		switch(month)
//		{
//			case 1:
//			case 3:
//			case 5:
//			case 7:
//			case 8:
//			case 10:
//			case 12:
//				System.out.println("31 days");
//				break;
//			case 2:
//				boolean isLeapYear=(year%100==0?year%400==0?true:false:year%4==0?true:false);
//				if(isLeapYear)
//					System.out.println("29 days");
//				else
//					System.out.println("28 days");
//				break;
//			case 4:
//			case 6:
//			case 9:
//			case 11:
//				System.out.println("30 days");
//				break;
//		}
		
		//<-Try using if-else->
		
//		char tkn = 'g';
//		int ascii = (int) tkn;
//		if (ascii == 32)
//			System.out.println("Blank Space");
//		else if (ascii >= 48 && ascii <= 57)
//			System.out.println("Number");
//		else if (ascii >= 65 && ascii <= 90)
//			System.out.println("UpperCase Letter");
//		else if (ascii >= 97 && ascii <= 122)
//			System.out.println("Lowercase Letter");
//		else
//			System.out.println("Special Character");

		//<-Try using switch-case->
		
//		System.out.println(ascii);
//		int checker = (ascii + 3) / 10, mod = (ascii + 3) % 10;
//		switch (checker) {
//		case 3:
//			if (mod == 5)
//				System.out.println("Blank Space");
//			break;
//		case 5:
//		case 6:
//			if (mod == 0)
//				System.out.println("Number");
//			else
//				System.out.println("UpperCase Letter");
//			break;
//		case 7:
//		case 8:
//		case 9:
//			System.out.println("UpperCase Letter");
//			break;
//		case 10:
//		case 11:
//		case 12:
//			if (mod <= 5)
//				System.out.println("Lowercase Letter");
//			else
//				System.out.println("Special Character");
//			break;
//		default:
//			System.out.println("Special Character");
//			break;
//		}

		
		
		
		
	}
}
