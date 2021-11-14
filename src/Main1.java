import java.util.ArrayList;

public class Main1 {

    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        cars.get(0);

        cars.set(0,"Opel");

        cars.remove(0);

        cars.clear();

        cars.size();


    }
}
