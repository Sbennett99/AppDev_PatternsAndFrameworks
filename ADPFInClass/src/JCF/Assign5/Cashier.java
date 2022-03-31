
package JCF.Assign5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.locks.ReentrantLock;

public class Cashier implements Runnable{

    private Walmart objWalmart;
    private String name;


    Cashier(String name, Walmart obj){
        this.name = name;
        this.objWalmart = obj;
    }

    @Override
    public void run() {
        ArrayList<String> items = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String input = "";
        Double num;
        objWalmart.lock.lock();
        try {
            while (!input.equals("quit")) {
                System.out.print(this.name + " says: Please enter an item or quit to exit: ");
                input = scan.nextLine();

                if (!input.equals("quit")) {
                    System.out.print(this.name + " says: Please enter a price or x to cancel the item: ");
                    try {
                        num = Double.parseDouble(scan.nextLine());
                        items.add(input);
                        prices.add(num);
                    } catch (NumberFormatException e) {

                    }
                }


            }
        }finally {
            objWalmart.lock.unlock();
            this.objWalmart.totalPrice(items, prices);

        }




    }
}
