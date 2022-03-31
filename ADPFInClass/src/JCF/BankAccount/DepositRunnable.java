package JCF.BankAccount;

public class DepositRunnable implements Runnable {

    private static final int DELAY = 10;
    private BankAccount account;
    private double amount;
    private int count;

    DepositRunnable(BankAccount account, double amount,int count){
        this.account = account;
        this.amount = amount;
        this.count = count;

    }


    @Override
    public void run() {
        for(int i = 0;i<this.count; i++){
            this.account.deposit(this.amount);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
