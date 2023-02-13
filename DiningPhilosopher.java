# 1

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
 
enum Status {
    THINKING, HUNGRY, EATING
}
 
public class DiningPhilosopher {
 
    public static void main(String a[])
    {
        Chopstick cs[]=new Chopstick[5];
         
        for(int i=0;i<5;i++)
            cs[i] = new Chopstick();
         
        Thread thPhilosoper[] = new Thread[5];
        for(int i=0;i<5;i++)
        {
            Philosopher ph = new Philosopher(i+1,cs);
            thPhilosoper[i] = new Thread(ph);
        }
        for(int i=0;i<5;i++)
        {
            thPhilosoper[i].start();
        }
    }
}
 
class Chopstick
{
    private final Lock cslock = new ReentrantLock();
     
     
    public Lock getCslock() {
        return cslock;
    }
}
 
class Philosopher implements Runnable
{
    private int n;
    private Chopstick cs[];
    private Status status;
     
    public  Philosopher(int n, Chopstick [] cs)
    {
        this.n = n;
        this.cs = cs;
        this.status = Status.THINKING;
    }
     
    public void run()
    {
        Lock csreqd1, csreqd2;
         
        csreqd1 = cs[n%5].getCslock();
        csreqd2 = cs[(n-1)%5].getCslock();
         
        while(true)
        {
                status = Status.HUNGRY;
                System.out.printf("Philosoper %d is hungry and waiting for chopsticks %d and %d \n",n,(n%5),(n-1)%5);
                if(csreqd1.tryLock())
                {
                    if(csreqd2.tryLock())
                    {
                        System.out.printf("Philosoper %d got chopsticks %d and %d \n",n,(n%5),(n-1)%5);
                        status = Status.EATING;
                    }
                    else
                    {
                        csreqd1.unlock();
                    }
                }
                 
                if(status == Status.HUNGRY)
                {
                    try
                    {
                        TimeUnit.SECONDS.sleep((long)(Math.random()*10));
                    }
                    catch(InterruptedException iex)
                    {
                        iex.printStackTrace();
                    }
                }
            if(status == Status.EATING)
            {        
                eat();
                csreqd1.unlock();
                csreqd2.unlock();
                System.out.printf("Philosoper %d has finished eating and relesed chopsticks %d and %d \n",n,(n%5),(n-1)%5);
                status = Status.THINKING;
                think();
            }
        }
    }
 
    private void think()
    {
        try
        {
            System.out.printf("Philosoper %d is thinking.\n",n);
            TimeUnit.SECONDS.sleep((long)(Math.random()*10));
        }
        catch(InterruptedException iex)
        {
            iex.printStackTrace();
        }
    }
     
    private void eat()
    {
        try
        {
            System.out.printf("Philosoper %d is eating rice\n",n);
            TimeUnit.SECONDS.sleep((long)(Math.random()*10));
        }
        catch(InterruptedException iex)
        {
            iex.printStackTrace();
        }
    }
}