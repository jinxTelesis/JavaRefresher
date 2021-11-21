import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CADemo {

    public static void main(String[] args){
        List<Integer> numList = new CopyOnWriteArrayList<Integer>();

        for(int i =1; i<=5;i++){
            numList.add(i);
        }

        // Creating new thread
        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(150);
                } catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }

                numList.add(6);
                System.out.println("" + numList);
            }
        }).start();

        Iterator<Integer> itr = numList.iterator();

        while(itr.hasNext()){
            Integer i = itr.next();
            try{
                Thread.sleep(30);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("" + i);
        }
    }


}
