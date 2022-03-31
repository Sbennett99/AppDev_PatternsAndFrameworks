package JCF.Threads;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadWithLock {
	
	public static void main(String[] args) 
	{
		ReentrantLock re = new ReentrantLock();
		CommonPrinter p = new CommonPrinter(re);

		ThreadA myRef = new ThreadA(p);
       myRef.start();


       ThreadB yourRef = new ThreadB(p);
       yourRef.start();
   }
}

class CommonPrinter
{
	ReentrantLock re;
	Condition c;
	
	public CommonPrinter(ReentrantLock re)
	{
		this.re =re;
		c = re.newCondition();
	}

   public void  printDocuments(int noOfCopies, String docName) throws InterruptedException  {
	   try {
		   re.lock();
		   for (int doc = 1; doc <= noOfCopies; doc++) 
		   {
			   if (doc%5==0)
				   c.await();
			   c.signalAll();
			   System.out.println("Printing " + docName + " " + doc);
		   }
	   }
	   finally 
	   {
		   re.unlock();
	   }
   }
}

class ThreadA extends Thread {

	CommonPrinter p;

   public ThreadA(CommonPrinter p) {
       this.p = p;
   }

   @Override
   public void run() {
	   try{
           p.printDocuments(12, "X.pdf");
	   }
	   catch(Exception e){}
   }

}

class ThreadB extends Thread {

	CommonPrinter p;

   public ThreadB(CommonPrinter p) {
       this.p = p;
   }

   @Override
   public void run() {
	   try{
           p.printDocuments(10, "Y.pdf");
	   }
	   catch(Exception e) {}

   }
}