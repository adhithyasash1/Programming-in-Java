package Activity;

public class FClass extends Thread{
    public void run(){
        for (int i=1;i<=5 ;i++ ){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        FClass example=new FClass();
        example.start();
    }
}

// sleep method should always be handled by try catch block for InterruptedException