package JCF.BankAccount;

public class BankAccountThreadTester {

    public  static void main(String[] args) throws InterruptedException{
        BankAccount account = new BankAccount();
        final double AMOUNT = 100;
        final int REPETITIONS = 1000;

        DepositRunnable dep = new DepositRunnable(account,AMOUNT,REPETITIONS);

        WithdrawRunnable with = new WithdrawRunnable(account,AMOUNT,REPETITIONS);

        Thread t1 = new Thread(dep);
        Thread t2 = new Thread(with);
        t1.start();
        t2.start();
    }
}
