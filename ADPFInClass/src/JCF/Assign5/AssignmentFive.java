package JCF.Assign5;

public class AssignmentFive {

    public static void main(String[] args){
        Walmart w = new Walmart();

        Cashier c = new Cashier("Charlie",w);
        Cashier d = new Cashier("Don",w);

        Thread t1 = new Thread(c);
        Thread t2 = new Thread(d);
        t1.start();
        t2.start();
    }

}
