import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args){
        Map<String, String> cityTemperatureMap = new TreeMap<String,String>();
        cityTemperatureMap.put("Delhi", "24");
        cityTemperatureMap.put("Mumbai", "32");
        cityTemperatureMap.put("Chennai", "35");
        cityTemperatureMap.put("Bangalore", "22" );
        cityTemperatureMap.put("Kolkata", "28");
        cityTemperatureMap.put("Chennai", "36");

        for(Map.Entry<String,String> me : cityTemperatureMap.entrySet()){
           System.out.println(me.getKey() + " " + me.getValue());
        }
        //Treemap is not synchronized

        //SortedMap m = Collections.synchronizedSortedMap(cityTemperatureMap)


    }

}

class TreeComparator implements Comparator<String>{
    @Override
    public int compare(String str1, String str2) {
        return str2.compareTo(str1);
    }
}
