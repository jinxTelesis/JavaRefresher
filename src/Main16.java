public class Main16 implements Runnable{

    public static void main(String[] args){
        Main16 obj = new Main16();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This code is outside of the thread");

    }

    public void run(){
        System.out.println("This code is running in a thread");
    }
}
