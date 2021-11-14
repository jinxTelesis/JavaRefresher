import java.util.ArrayList;
import java.util.function.Consumer;

public class Main19 {

    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

        numbers.forEach((n) -> { System.out.println(n);});

        ArrayList<Integer> numbers2 = new ArrayList<Integer>();
        numbers2.add(5);
        numbers2.add(9);
        numbers2.add(8);
        numbers2.add(1);

        Consumer<Integer> method = (n) -> {System.out.println(n);};

        numbers.forEach(method);
    }

}
