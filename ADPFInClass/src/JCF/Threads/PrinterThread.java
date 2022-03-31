package JCF.Threads;

public class PrinterThread {
	
	public static void main(String[] args)
	{
		Printers p1 = new Printers(1);
		Printers p3 = new Printers(3);
		Thread t1 = new Thread(p1);
		Thread t3 = new Thread(p3);
		t1.start();
		t3.start();
		System.out.println("Start printer 2");
	    for (int doc = 1; doc <= 10; doc++) 
	    {
	    	System.out.println("Printing document# " + doc + " from Printer2");
	    }
	        System.out.println("End printer 2");
	        System.out.println("======================");
	}
}


class Printers implements Runnable
{
	int printerNumber;
	
	public Printers(int printerNumber)
	{
		this.printerNumber = printerNumber;
	}
	
	public void run()
	{
		System.out.println("Start printer "+printerNumber);
        for (int doc = 1; doc <= 10; doc++) {
            System.out.println("Printing document# " + doc + " from Printer"+printerNumber);
        }
        System.out.println("End printer "+printerNumber);
        System.out.println("======================+");
		
	}
	
}