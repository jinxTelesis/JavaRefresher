import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapItr2 {

    public static void main(String[] args){

        Map<String,String> langMap = new TreeMap<String,String>();
        langMap.put("ENG","English");
        langMap.put("NLD","Dutch");
        langMap.put("ZHO","Chinse");

        Set<Map.Entry<String, String>> langSet = langMap.entrySet();
        Iterator<Map.Entry<String, String>> itr = langSet.iterator();

        while(itr.hasNext()){
            Map.Entry<String, String> entry = itr.next();

            if(entry.getKey().equals("NLD")){
                itr.remove();
            }
        }

        for(Map.Entry<String, String> lang : langMap.entrySet()){
            System.out.println("Key- " + lang.getKey() + " Value- " + lang.getValue());
        }



    }
}
