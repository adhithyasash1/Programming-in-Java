package Activity;

import java.util.concurrent.locks.*;
public class EClass {
    public static void main(String[] args){
        ReentrantLock lck=new ReentrantLock();
        lck.lock();
        System.out.print(lck.isLocked()+" ");
        System.out.print(lck.getHoldCount()+"\n");
        lck.lock();
        System.out.print(lck.getHoldCount()+" ");
        lck.unlock();
        System.out.print(lck.getHoldCount()+" ");
        System.out.print(lck.isLocked()+"\n");
    }
}