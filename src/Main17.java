import sun.applet.Main;

public class Main17 extends Thread {

    public static int amount = 0;

    public static void main(String[] args){

        Main17 thread = new Main17();
        thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }

    public void run(){
        amount++;
    }

}
