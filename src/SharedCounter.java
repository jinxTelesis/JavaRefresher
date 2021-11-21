import java.util.concurrent.Semaphore;

public class SharedCounter implements Runnable{

    private int c = 0;
    private Semaphore s;
    SharedCounter(Semaphore s){
        this.s = s;
    }

    public void increment(){
        try{
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        c++;
    }

    public void decrement(){
        c--;
    }

    public int getValue(){
        return c;
    }

    @Override
    public void run() {
        try {
            // acquire method to get one permit
            s.acquire();
            this.increment();
            System.out.println("Value for Thread After increment - " + Thread.currentThread().getName() + " " + this.getValue());
            this.decrement();
            System.out.println("Value for Thread at last " + Thread.currentThread().getName() + " " + this.getValue());
            // releasing permit
            s.release();
        }
        catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
