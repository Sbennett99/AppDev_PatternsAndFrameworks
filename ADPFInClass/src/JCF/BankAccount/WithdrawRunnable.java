package JCF.BankAccount;

public class WithdrawRunnable implements Runnable {


    private static final int DELAY = 10;
    private BankAccount account;
    private double amount;
    private int count;

    WithdrawRunnable(BankAccount account, double amount,int count){
        this.account = account;
        this.amount = amount;
        this.count = count;

    }


    @Override
    public void run(){
        for(int i = 0;i<this.count; i++){

            try {
                this.account.withdraw(this.amount);
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
