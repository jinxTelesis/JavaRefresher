public class RunnableLambda {

    public static void main(String[] args){

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable with anonymous");
            }
        }).start();

        // Runnable using lambda
        new Thread(()-> System.out.println("Runnable Lambda")).start();

    }

}
