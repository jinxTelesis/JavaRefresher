import java.util.concurrent.Phaser;

public class PhaserAdvance extends Phaser {

    PhaserAdvance(int parties){
        super(parties);
    }


    protected boolean onAdvance(int phase, int registeredParties){
        System.out.println("In onAdvance method, current phase which is completed is " + phase);

        if(phase == 1 || registeredParties == 0){
            System.out.println("phaser will be terminated");
            return true;
        } else {
            System.out.println("phaser will continue");
            return false;
        }
    }

    public static void main(String... args){




    }

}
