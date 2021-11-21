import java.util.concurrent.CountDownLatch;

public class CountdownlatchDemo3 {

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
        Thread t4 = new Thread(new FileReader("thread-4", "file-4", cdl));
        Thread t5 = new Thread(new FileReader("thread-5", "file-5", cdl));
        Thread t6 = new Thread(new FileReader("thread-6", "file-6", cdl));
        t4.start();
        t5.start();
        t6.start();
        try {
            // main thread waiting till all the files are read
            // this will not block
            cdl.await();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Files are read again ... Start further processing");
    }



}
