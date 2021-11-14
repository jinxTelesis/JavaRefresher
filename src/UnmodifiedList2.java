import java.util.ArrayList;
import java.util.List;

public class UnmodifiedList2 {

    public static void main(String[] args){
        List<String> alphaList = List.of("a","b","c","d");

        List<String> alphaList2 = new ArrayList<>();
        alphaList2.add("a");
        alphaList2.add("b");
        alphaList2.add("c");
        alphaList2.add("d");

        List<String> aList = List.copyOf(alphaList2);
        alphaList2.add("e");

        // shallow copy of a list than you then create an unmodifiable will not update


    }
}
