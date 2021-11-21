import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class UnmodifiableMap {

    public static void main(String[] args) {
        Map<String, String> alphaMap = new HashMap<String,String>();
        alphaMap.put("1", "a");
        alphaMap.put("2", "b");
        alphaMap.put("3", "c");
        alphaMap.put("4", "d");

        Map<String,String> aMap = Collections.unmodifiableMap(alphaMap);
        alphaMap.put("5","e");

        //aMap.put("6","f");
        // unmodifiablemap
        Map<String, String> alphaMap2 = Map.of("1","a", "2","b", "3","c", "4","d");

        // unmodifiablemap
//        Map<String, String> alphaMap = Map.ofEntries(entry("1", "a"), entry("2", "b"),
//                entry("3", "c"), entry("4", "d"));


        // unmodifiablemap
        Map<String,String> alphaMap3 = new HashMap<String,String>();
        alphaMap3.put("1","a");

        Map<String, String> aMap2 = Map.copyOf(alphaMap);

    }

}
