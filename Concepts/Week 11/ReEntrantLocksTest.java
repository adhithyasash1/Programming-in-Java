import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Bank {
    private Lock bankLock = new ReentrantLock();
    // ...
    public void
    transfer(int from, int to, int amount) {
        bankLock.lock();
        try {
            //  accounts[from] -= amount;
            //  accounts[to] += amount;
        }
        finally {
            bankLock.unlock();
        }
    }
}

public class ReEntrantLocksTest{
}
