package Activity;
import java.util.concurrent.locks.*;

class DemoLock{
    ReentrantLock lck=new ReentrantLock();
    public void display(String name){
        lck.lock();
        lck.lock();
        try{
            for(int i=1;i<4;i++){
                System.out.print(i+":"+name+" ");
            }
            System.out.print("\n");
        }
        finally{
            lck.unlock();
        }
    }
}

class Example extends Thread{
    DemoLock obj;
    String str;
    Example(DemoLock obj, String str){
        this.obj=obj;
        this.str=str;
    }
    public void run(){
        obj.display(str);
    }
}
public class DClass {
    public static void main(String[] args){
        DemoLock obj=new DemoLock();
        Sample e1=new Sample(obj, "Sun");
        Sample e2=new Sample(obj, "Moon");
        Sample e3=new Sample(obj, "Earth");
        e1.start();
        e2.start();
        e3.start();
    }
}