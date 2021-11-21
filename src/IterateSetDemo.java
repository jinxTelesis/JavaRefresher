import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterateSetDemo {

    public static void main(String[] args) {
        Set<String> citySet = new HashSet<String>();

        citySet.add("London");
        citySet.add("Tokyo");
        citySet.add("New Delhi");
        citySet.add("Beijing");
        citySet.add("Nairobi");

        for(String city: citySet){
            System.out.println("city- " + city);
        }

        Iterator<String> itr = citySet.iterator();
        while(itr.hasNext()){
            System.out.println("city- " + itr.hasNext());
        }

        citySet.forEach((city)->System.out.println("city- " +city));


    }

}
