public class main15 extends Thread{

    public static void main(String[] args){
        main15 thread = new main15();
        thread.start();

        System.out.println("this code is outside of the thread");
    }

    public void run(){
        System.out.println("this code is running in a thread");
    }
}
