import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapSorting3 {

    public static void main(String[] args) {
        Map<String, String> langMap = new HashMap<String,String>();

        langMap.put("ENG", "English");
        langMap.put("NLD", "Dutch");
        langMap.put("ZHO", "Chinese");
        langMap.put("BEN", "Bengali");
        langMap.put("ZUL", "Zulu");
        langMap.put("FRE", "French");

        Set<Map.Entry<String,String>> langset = langMap.entrySet();

        for(Map.Entry<String,String> entry: langset){
            System.out.println("Key is " + entry.getKey() + " Value is " + entry.getValue());
        }
    }
}
