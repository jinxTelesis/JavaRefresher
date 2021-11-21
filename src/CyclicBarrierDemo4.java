import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo4 {

    public static void main(String[] args){

        CyclicBarrier cb = new CyclicBarrier(3, new AfterAction());

        Thread t1 = new Thread(new TxtReader("thread-1", "file-1", cb));
        Thread t2 = new Thread(new TxtReader("thread-2", "file-2", cb));
        Thread t3 = new Thread(new TxtReader("thread-3", "file-3", cb));

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Start another set of threads ");

        Thread t4 = new Thread(new TxtReader("thread-4", "file-4", cb));
        Thread t5 = new Thread(new TxtReader("thread-5", "file-5", cb));
        Thread t6 = new Thread(new TxtReader("thread-6", "file-6", cb));
        t4.start();
        t5.start();
        t6.start();

    }

}
