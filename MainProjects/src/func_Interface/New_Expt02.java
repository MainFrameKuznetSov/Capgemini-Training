package func_Interface;
/*
 *
 * Using Runnable interface
 * 
 * */

class Cl1 implements Runnable
{
	@Override
	public void run()
	{
//		super.run();
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

class Cl2 implements Runnable
{
	@Override
	public void run()
	{
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

public class New_Expt02 
{
	
	public static void main(String[] args) 
	{
		Cl1 cl1=new Cl1();
		Thread t1=new Thread(cl1);
		Cl2 cl2=new Cl2();
		Thread t2=new Thread(cl2);
		t1.start();
		t2.start();
	}
}
