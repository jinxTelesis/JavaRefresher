import java.util.HashMap;
import java.util.Map;

public class HashMapSorting {

    public static void main(String[] arg){
        // map is the interface
        Map<String, String> langMap = new HashMap<String,String>();
        langMap.put("ENG","English");
        langMap.put("NLD","Dutch");
        langMap.put("ZHO","Chinese");
        langMap.put("BEN","Bengali");

        String language = langMap.get("BEN");
        System.out.println("Language- " + language);

        for(Map.Entry<String,String> lang : langMap.entrySet()){
            System.out.println("Key- " + lang.getKey()
            + " Value-" + lang.getValue());
        }

        for(Map.Entry<String,String> lang: langMap.entrySet()){
            System.out.println(lang.getKey() + lang.getValue());
        }
    }

}
