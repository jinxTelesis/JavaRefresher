public class Main22 extends Thread{
    public static int amount = 0;

    public static void main(String[] args){
        Main22 thread = new Main22();
        thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }

    public void run(){
        amount++;
    }
}
