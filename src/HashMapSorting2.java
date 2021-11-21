import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapSorting2 {
    public static void main(String[] args) {
        Map<String,String> langMap = new HashMap<String,String>();
        langMap.put("ENG", "English");
        langMap.put("NLD", "Dutch");
        langMap.put("ZHO", "Chinese");
        langMap.put("BEN", "Bengali");
        langMap.put("ZUL", "Zulu");
        langMap.put("FRE", "French");

        Set<Map.Entry<String,String>> langSet = langMap.entrySet();
        Iterator<Map.Entry<String,String>> itr = langSet.iterator();

        while(itr.hasNext()){
            Map.Entry<String,String> entry = itr.next();
            System.out.println("Key is " + entry.getKey() + " Value is " + entry.getValue());

            // don't modify collection view types
            if(entry.getKey().equals("NLD")){
                langMap.remove(entry.getKey());
            }
            // not synchronized

        }

    }

}
