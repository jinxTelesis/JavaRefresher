import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class SecondService implements Runnable{

    CyclicBarrier cb;
    SecondService(CyclicBarrier cb){
        this.cb = cb;
    }
    @Override
    public void run() {
        System.out.println("In Second service, thread " + Thread.currentThread().getName());
        try {
            // Calling await for Thread-1
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
