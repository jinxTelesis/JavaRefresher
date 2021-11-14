import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

    public static void main(String[] args){

        List<Integer> numberList = new ArrayList<Integer>();
        ListIterator<Integer> ltr = null;

        numberList.add(25);
        numberList.add(17);
        numberList.add(108);
        numberList.add(76);
        numberList.add(2);
        numberList.add(36);

        ltr = numberList.listIterator();

        System.out.println("Iterating list in forward direction");

        while(ltr.hasNext()){
            System.out.println(ltr.next());
        }

        // backward iteration
        System.out.println("iterating list in backward direction");

        while(ltr.hasPrevious()){
            System.out.println(ltr.hasPrevious());
        }


    }

}
