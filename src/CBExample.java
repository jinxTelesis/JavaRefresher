import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CBExample {

    public static void main(String[] args){
        CyclicBarrier cb = new CyclicBarrier(3);

        Thread t1 = new Thread(new FirstService(cb));
        Thread t2 = new Thread(new SecondService(cb));

        System.out.println("starting threads");
        t1.start();
        t2.start();

        try {
            // Calling await for main thread
            cb.await();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        // once await is called for all the three threads, execution starts again
        System.out.println("In main thread, processing starts again ..... ");
    }

}
