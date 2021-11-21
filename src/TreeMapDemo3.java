import java.util.*;

public class TreeMapDemo3 {

    public static void main(String[] args){

        Map<String,String> cityTemperatureMap = new TreeMap<String,String>();

        cityTemperatureMap.put("Delhi","24");
        cityTemperatureMap.put("Mumbai","32");
        cityTemperatureMap.put("Chennai","35");


        for(Map.Entry<String,String> me : cityTemperatureMap.entrySet()){
            System.out.println(me.getKey() + " " + me.getValue());
        }

       // Collection view of the TreeMap
        Set<Map.Entry<String,String>> langSet = cityTemperatureMap.entrySet();
        Iterator<Map.Entry<String, String>> itr = langSet.iterator();

        while(itr.hasNext()){
            Map.Entry<String,String> entry = itr.next();
            System.out.println("Key is " + entry.getKey() + " Value is" + entry.getValue());

            if(entry.getKey().equals("NLD")){

            }
        }

    }

}
