import java.util.ArrayList;
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
        aList.add("e");

        System.out.println("alphaList- " + alphaList);
        aList.add("f");
    }

}
