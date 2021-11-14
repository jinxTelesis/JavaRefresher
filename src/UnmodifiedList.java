import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnmodifiedList {

    public static void main(String[] args){
        List<String> alphaList = new ArrayList<>();
        alphaList.add("a");
        alphaList.add("b");
        alphaList.add("c");
        alphaList.add("d");

        List<String> aList = Collections.unmodifiableList(alphaList);
        // this will cause an Exception
        aList.add("e");

        // this will cause an Exception
        System.out.println("alphaList- " + alphaList);
        aList.add("f");

        List<String> alphaList2 = Arrays.asList("a","b","c","d");
        List<String> aList2 = Collections.unmodifiableList(alphaList2);


    }

}
