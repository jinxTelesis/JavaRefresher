import java.util.LinkedList;

public class Main5 {

    public static void main(String[] args){
        LinkedList<String> cars = new LinkedList<String>();

        cars.add("volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars);

        cars.addFirst("a");
        cars.addLast("b");
        cars.removeFirst();
    }
}
