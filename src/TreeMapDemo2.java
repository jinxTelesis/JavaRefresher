import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2 {

    //Map<String, String> cityTemperatureMap = new TreeMap<String,String>(new TreeComparator());
    public static void main(String[] args) {
        Map<String, String> langMap = new TreeMap<String,String>();
        langMap.put("ENG", "English");
        langMap.put("NLD", "Dutch");
        langMap.put("ZHO", "Chinese");
        langMap.put("BEN", "Bengali");
        langMap.put("ZUL", "Zulu");
        langMap.put("FRE", "French");

        Set<Map.Entry<String,String>> langSet = langMap.entrySet();
        Iterator<Map.Entry<String,String>> itr = langSet.iterator();
    }



}
