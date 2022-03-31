package JCF.Threads;

public class Printer {
	
	public void printerOne()
	{
		System.out.println("Start printer 1");
        for(int doc=1; doc<=10; doc++)
        {
            System.out.println("Printing document# "+doc +" from Printer1");
        }
         System.out.println("End printer 1");
        System.out.println("======================");
		
	}
	
	public void printerTwo()
	{
		System.out.println("Start printer 2");
        for(int doc=1; doc<=10; doc++)
        {
            System.out.println("Printing document# "+doc +" from Printer2");
        }
         System.out.println("End printer 2");
         System.out.println("======================");
	}
	
	public static void main(String[] args)
	{
		Printer p = new Printer();
        p.printerOne();
        p.printerTwo();
	}

}
