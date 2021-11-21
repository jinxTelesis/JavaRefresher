import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class FirstService implements Runnable {

    CyclicBarrier cb;
    FirstService(CyclicBarrier cb){
        this.cb = cb;
    }

    @Override
    public void run() {
        System.out.println("In First service, thread " + Thread.currentThread().getName());
        try {
            // Calling await for Thread-0
            cb.await();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
