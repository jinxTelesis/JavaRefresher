public class Main23 extends Thread{

    public static int amount = 0;

    public static void main(String[] args){
        Main23 thread = new Main23();
        thread.start();

        while(thread.isAlive()){
            System.out.println("waiting...");
        }

        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);

    }

    public void run(){
        amount++;
    }

}
