package Day13;

public class RunnableDemo {
	
	public static void main(String[] args) {
		
	UsingRunnable obj =new UsingRunnable(5,10,"hello coders...");
	
	Runnable runnable=new Runnable() {
		public void run()
		{
			System.out.println("running task from anonymous class");
		}
	};
	Thread thread=new Thread();
	thread.start();
	}

}
 