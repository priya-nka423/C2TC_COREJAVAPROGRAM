package Day13;

public class UsingRunnable implements Runnable{
	 
	Thread thread;
	int low,high;
	String msg;
	public UsingRunnable(int low, int high, String msg) {
		super();
		this.low = low;
		this.high = high;
		this.msg = msg;
		thread =new Thread(this,"child thread");
		thread.start();
	}
	@Override
	public void run()
	{
		for(int i=low;i<=high;i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println("Error:"+e.getMessage());
			}
			System.out.println(msg+" "+i);
		}
	}
}
