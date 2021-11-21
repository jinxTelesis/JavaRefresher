import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {

    public static void main(String[] args){
        CyclicBarrier cb = new CyclicBarrier(3 , new AfterAction());

        Thread t1 = new Thread(new TxtReader("thread-1", "file-1", cb));
        Thread t2 = new Thread(new TxtReader("thread-2", "file-2", cb));
        Thread t3 = new Thread(new TxtReader("thread-3", "file-3", cb));
        t1.start();
        t2.start();
        t3.start();
        // main thread blocks
        System.out.println("Done ");
    }

}
