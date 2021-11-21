import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo2 {

    public static void main(String[] args){
        CountDownLatch cdl = new CountDownLatch(3);

        Thread t1 = new Thread(new FileReader("thread-1", "file-1", cdl));
        Thread t2 = new Thread(new FileReader("thread-2", "file-2", cdl));
        Thread t3 = new Thread(new FileReader("thread-3", "file-3", cdl));
        t1.start();
        t2.start();
        t3.start();
        //count down latch is shared and waits for 3 threads to finish
        // the cdl.await(); is not await
        try{
            cdl.await();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Files are read .. Start further processing");

        // one thread can decrement all 3 times to pass
        //CountDownLatch in Java can not be reused

        //another call to await will not block any thread


    }





}
