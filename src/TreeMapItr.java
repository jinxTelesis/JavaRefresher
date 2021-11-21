import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapItr {

    public static void main(String[] arg){
        Map<String,String> langMap = new TreeMap<String,String>();
        langMap.put("ENG", "English");
        langMap.put("NLD", "Dutch");
        langMap.put("ZHO", "Chinese");
        langMap.put("BEN", "Bengali");
        langMap.put("ZUL", "Zulu");
        langMap.put("FRE", "French");

        Set<Map.Entry<String, String>> langSet = langMap.entrySet();
        Iterator<Map.Entry<String, String>> itr = langSet.iterator();

        while(itr.hasNext()){
            Map.Entry<String, String> entry = itr.next();

            System.out.println("Key is " + entry.getKey() + " Value is " + entry.getValue());


        }
    }

}
