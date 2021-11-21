import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class HashTableDemo {

    public static void main(String[] args) {
        Hashtable<String, Integer> numbers = new Hashtable<String, Integer>();
        numbers.put("one",1);
        numbers.put("two",2);
        numbers.put("three",3);

        // Using enumerator
        for (Enumeration<String> e = numbers.keys(); e.hasMoreElements();){
            System.out.println(e.nextElement());
            numbers.put("four",4);
        }

        // Using iterator
        Iterator<String> itr = numbers.keySet().iterator();
        while(itr.hasNext()){
            System.out.println(numbers.get(itr.next()));
            numbers.put("five",5);
        }
    }
}
