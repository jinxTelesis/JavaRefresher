import java.util.concurrent.Exchanger;

public class ProducerThread implements Runnable{

    String str;
    Exchanger<String> ex;
    ProducerThread(Exchanger<String> ex){
        this.ex = ex;
        str = new String();
    }
    public void run(){
        for(int i =0; i < 3; i++){
            str = "Producer" + i;
            try{
                str = ex.exchange(str);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
