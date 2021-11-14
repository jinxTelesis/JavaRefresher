import java.util.ArrayList;
import java.util.Iterator;

public class Main7 {

    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Volvo");


        Iterator<String> it = cars.iterator();

        System.out.println(it.next());

        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
