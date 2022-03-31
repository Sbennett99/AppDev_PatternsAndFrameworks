package JCF.Threads;

public class ThreadWS extends Thread{ 
	public void run() 
	{
		System.out.println("Thread Id is " + 
			Thread.currentThread().getId());
	}
	
	public static void main(String[] args)
	{ 
		int n = 11; // Number of threads
		for (int i = 0; i < n; i++) 
		{
			ThreadWS object = new ThreadWS();
			object.start(); 
		}
	}

}
