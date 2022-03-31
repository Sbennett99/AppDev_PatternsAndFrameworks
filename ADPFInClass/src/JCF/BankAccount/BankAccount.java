package JCF.BankAccount;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private double balance;
    private ReentrantLock lock;
    private Condition c;

    BankAccount(){
        balance = 0;
        lock = new ReentrantLock();
        c = lock.newCondition();

    }

    public double getBalance(){
        return this.balance;


    }

    private void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        lock.lock();
        try {
            setBalance(this.getBalance() + amount);
            System.out.println("Depositing: " + amount);
            System.out.println("New balance is " + this.getBalance());
            c.signalAll();
        }finally {
            lock.unlock();
        }
    }

    public void withdraw(double amount)throws InterruptedException{

        lock.lock();
        try {
            while (this.balance < amount){
                c.await();
            }
            setBalance(this.getBalance() - amount);
            System.out.println("Withdrawing: " + amount);
            System.out.println("New balance is " + this.getBalance());
        }finally {
            lock.unlock();
        }
    }
}
