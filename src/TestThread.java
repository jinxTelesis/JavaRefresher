import java.util.concurrent.Phaser;

public class TestThread implements Runnable{

    private String threadName;
    private Phaser ph;

    TestThread(String threadName, Phaser ph){
        this.threadName = threadName;
        this.ph = ph;
        ph.register();
        new Thread(this).start();
    }
    @Override
    public void run() {
        // be in the loop till the phaser is terminated
        while(!ph.isTerminated()){
            System.out.println("This is phase " + ph.getPhase() +
                    " And Thread - "+ threadName);
            // Using await and advance so that all thread wait here
            ph.arriveAndAwaitAdvance();
        }
    }



}
