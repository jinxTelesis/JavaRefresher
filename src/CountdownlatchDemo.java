import java.util.concurrent.CountDownLatch;

public class CountdownlatchDemo {

    public static void main(String[] args){

        CountDownLatch cdl = new CountDownLatch(3);

        Thread t1 = new Thread(new FileReader("thread-1", "file-1", cdl));
        Thread t2 = new Thread(new FileReader("thread-2", "file-2", cdl));
        Thread t3 = new Thread(new FileReader("thread-3", "file-3", cdl));
        t1.start();
        t2.start();
        t3.start();

        try{
            cdl.await();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Files are read .. Start further processing");

    }

}


