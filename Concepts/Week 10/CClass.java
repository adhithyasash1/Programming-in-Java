package Activity;

public class CClass extends Thread{
    public void run(){
        System.out.println("Thread running");
    }
    public static void main(String[] args) {
        CClass t1=new CClass();
        t1.start();
        t1.start();
    }
}