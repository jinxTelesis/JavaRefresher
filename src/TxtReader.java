import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class TxtReader implements Runnable {

    private String threadName;
    private String fileName;
    private CyclicBarrier cb;

    TxtReader(String threadName, String fileName, CyclicBarrier cb) {
        this.threadName = threadName;
        this.fileName = fileName;
        this.cb = cb;

    }
    @Override
    public void run(){
        System.out.println("Reading file" + fileName + " thread "+ threadName);
        try{
            cb.await();
        } catch (InterruptedException e){
            System.out.println(e);
        } catch (BrokenBarrierException e){
            System.out.println(e);
        }
    }

}


