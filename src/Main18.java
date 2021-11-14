import sun.awt.Symbol;

public class Main18 extends Thread{

    public static int amount = 0;

    public static void main(String[] args) {
        Main18 thread = new Main18();
        thread.start();
        // Wait for the thread to finish
        while(thread.isAlive()) {
            System.out.println("Waiting...");
        }
        // Update amount and print its value
        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);
    }
    public void run() {
        amount++;
    }
}
