package func_Interface;
/*
 * 
 * Two ways of MultiThreading
 * i) extending Thread class
 * ii) using Runnable interface
 * 
 * */
import java.util.Scanner;

class C1 extends Thread
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		System.out.println("START");
		Scanner userInput=new Scanner(System.in);
		System.out.println("Enter first num:- ");
		int n1=userInput.nextInt();
		userInput.nextLine();
		System.out.println("Enter second num:- ");
		int n2=userInput.nextInt();
		userInput.nextLine();
		System.out.println("Sum ="+(n1+n2));
		System.out.println("END");
		
	}
}

class C2 extends Thread
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("Printing characters");
		for(int i=65;i<=75;++i)
		{
			System.out.println((char)i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class C3 extends Thread
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("Printing digits");
		for(int i=0;i<=9;++i)
		{
			System.out.println(i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class New_Expt01 
{
	public static void main(String[] args) 
	{
		C1 c1=new C1();
		C2 c2=new C2();
		C3 c3=new C3();
		
		c1.start();
		c2.start();
		c3.start();
	}
}
