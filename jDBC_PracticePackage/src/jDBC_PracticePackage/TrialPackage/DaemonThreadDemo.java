package jDBC_PracticePackage.TrialPackage;

public class DaemonThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("START of main()");
//		Thread.sleep(1000);
		Thread daemonThread=new Thread(()->
		{
			while(true)
			{
				System.out.println("Inside Daemon Thread");
				try
				{
					Thread.sleep(1000);
				}
				catch(InterruptedException ex)
				{
					ex.getMessage();
				}
			}
		});
		daemonThread.setDaemon(true);
		daemonThread.start();
		System.out.println("END of main()");
	}

}
