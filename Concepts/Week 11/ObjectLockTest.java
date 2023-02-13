
public class ObjectLockTest {
    Object o = new Object();
    int something = 0;

    public int f() throws InterruptedException {
        //..
        synchronized(o){
            // ...
            o.wait(); // Wait in queue attached to "o"
            // ...
        }
        return something;
    }

    public double g(){
        // ..
        synchronized(o){
            // ...
            o.notifyAll(); // Wake up queue attached to ...
        }
        return something;
    }
}
