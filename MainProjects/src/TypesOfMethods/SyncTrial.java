package TypesOfMethods;

class A
{
	synchronized void methodA(B b)
	{
		System.out.println("Thread 1 holding A");
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e){}
		System.out.println("Thread 1 waiting for A");
		b.last();
	}
	
	public void last()
	{
		System.out.println("In A last()");
	}
	
}

class B
{
	synchronized void methodB(A a)
	{
		System.out.println("Thread 2 holding B");
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e){}
		System.out.println("Thread 2 waiting for B");
		a.last();
	}
	
	synchronized public void last()
	{	
		System.out.println("In B last()");
	}
	
}

//class Top implements Runnable
//{
//	
//	int counter=0;
//	
//	//Not using synchronized leads to race condition where both threads t1 and t2 try to update counter and cause 
//	//faulty updates leading to data loss.
//	synchronized public void execute()									
//	{
//		++counter;
//	}
//	
//	@Override
//	public void run()
//	{
//		for(int i=1;i<=50000;++i)
//			execute();
//	}
//}

public class SyncTrial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Top top=new Top();
//		Thread t1=new Thread(top);
//		Thread t2=new Thread(top);
//		t1.start();
//		t2.start();
//		/*
//		 * Without t1.join(), the 'main()' thread executes before the thread scheduler assigns resources to the 't1' thread.
//		 * */
//		try {
//			t1.join();
//			/*
//			 * Using t1.join(), we actually suggest the thread scheduler to wait for 't1' to complete and then end the 'main'
//			 * thread
//			 * */
//			t2.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(top.counter);
		
		A a=new A();
		B b=new B();
		Thread t1=new Thread()
		{
			@Override
			public void run()
			{
				a.methodA(b);
			}
		};
		Thread t2=new Thread()
		{
			@Override
			public void run()
			{
				b.methodB(a);
			}
		};
		
		t1.start();
		t2.start();
		try 
		{
			t1.join();
		} catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}