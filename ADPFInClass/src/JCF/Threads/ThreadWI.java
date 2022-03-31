package JCF.Threads;

public class ThreadWI implements Runnable{
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
        	 ThreadWI object = new ThreadWI();
             Thread t = new Thread(object);
             t.start();
         }
    }
}
