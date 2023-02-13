package Activity;

public class EClass extends Thread{
    public static void main(String[] args) {
        EClass t1=new EClass();
        System.out.println(t1.getName());
        System.out.println(t1.getPriority());
    }
}
