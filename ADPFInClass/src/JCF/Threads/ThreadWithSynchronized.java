package JCF.Threads;

public class ThreadWithSynchronized {
	
	public static void main(String[] args) 
	{
		SharedPrinter p = new SharedPrinter();

       MyThread myRef = new MyThread(p);
       myRef.start();

       YourThread yourRef = new YourThread(p);
       yourRef.start();
   }
}

class SharedPrinter
{
   public void  printDocuments(int noOfCopies, String docName){
		   for (int doc = 1; doc <= noOfCopies; doc++) 
		   {
			   System.out.println("Printing " + docName + " " + doc);
		   }
   }
}

class MyThread extends Thread {

	SharedPrinter p;

   public MyThread(SharedPrinter p) {
       this.p = p;
   }

   @Override
   public void run() {
       synchronized (p) {
           p.printDocuments(12, "X.pdf");
	   }
   }

}

class YourThread extends Thread {

	SharedPrinter p;

   public YourThread(SharedPrinter p) {
       this.p = p;
   }

   @Override
   public void run() {
      synchronized (p) {
           p.printDocuments(10, "Y.pdf");
   }
   }
}