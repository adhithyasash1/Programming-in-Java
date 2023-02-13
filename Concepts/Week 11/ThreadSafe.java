
class Q {
    private int n;
    private boolean valueSet=false;
    public synchronized int get(){
        if(!valueSet){
            try{
                wait();
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
        valueSet=false;
        notify();
        return n;
    }
    public synchronized void put(int value){
        if(valueSet==true){
            try{
                wait();
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
        n=value;
        valueSet=true;
        notify();
    }
}
class Producer extends Thread{
    private Q q;
    private int number;
    Producer(Q q,int number){
        this.q=q;
        this.number=number;
    }
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println("Producer put item"+i);
            q.put(i);
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){
            }
        }
    }
}
class Consumer extends Thread{
    private Q q;
    private int number;
    Consumer(Q q,int number){
        this.q=q;
        this.number=number;
    }
    public void run(){
        for (int i=1;i<=5;i++){
            int value;
            value=q.get();
            System.out.println("Consumer got item"+value);
        }
    }
}
public class ThreadSafe {
    public static void main(String[] args) {
        Q q=new Q();
        Producer p1=new Producer(q,1);
        Consumer c1=new Consumer(q,1);
        p1.start();
        c1.start();
    }
}