import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortListDemo {

    public static void main(String[] args){

        List<String> cityList = Arrays.asList("Delhi","Mumbai","Bangalore","Chennai","Kolkata");
        Collections.sort(cityList);
        Collections.sort(cityList,Collections.reverseOrder());

        Collections.sort(cityList, (String a, String b)-> b.compareTo(a));


    }
}
