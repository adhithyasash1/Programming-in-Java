import java.util.concurrent.*;

class Accounts {
    double account_id;
    double balance;

    public Accounts (double n, double b) {
        this.account_id = n;
        this.balance = b;
    }
}

class bank_account{
    // double accounts[100];
    double[] accounts;

    public synchronized boolean
    transfer(double amount, int source, int target) throws InterruptedException {
        while (accounts[source] < amount){ wait(); }
        accounts[source] -= amount;
        accounts[target] += amount;
        notifyAll();
        return true;
    }
    public synchronized double audit(){
        double balance = 0.0;
        for (int i = 0; i < 100; i++)
            balance += accounts[i];
        return balance;
    }
    public double current_balance(int i){
        return accounts[i]; // not synchronized!
    }
}

public class MonitorTest {

}

