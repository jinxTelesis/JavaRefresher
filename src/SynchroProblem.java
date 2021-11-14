import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchroProblem implements Runnable{
    private List<Integer> numList;

    public SynchroProblem(List<Integer> numList){
        this.numList = numList;
    }

    public void run(){
        System.out.println("in run method");
        for(int i = 0; i < 10; i++){
            numList.add(i);
            try{
                Thread.sleep(50);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        //List<Integer> numList = new ArrayList<>();
        List<Integer> numList = Collections.synchronizedList(new ArrayList<Integer>());

        Thread t1 = new Thread(new SynchroProblem(numList));
        Thread t2 = new Thread(new SynchroProblem(numList));
        Thread t3 = new Thread(new SynchroProblem(numList));

        t1.start();
        t2.start();
        t3.start();
        try{
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Size of list is " + numList.size());
        for(Integer i: numList){
            System.out.println("num - " + i);
        }

        List list = Collections.synchronizedList(new ArrayList<>());

//        synchronized (list){
//            Iterator i = list.iterator();
//            while(i.hasNext())
//                //foo(i.next());
//        }

    }

}
