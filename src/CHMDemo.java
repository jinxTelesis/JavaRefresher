import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CHMDemo {

    public static void main(String[] args){
        Map<String, String> cityTemperatureMap = new ConcurrentHashMap<String,String>();

        cityTemperatureMap.put("Delhi","24");

        for(Map.Entry<String,String> e: cityTemperatureMap.entrySet()){
            System.out.println(e.getKey() + " = " + e.getValue());
        }


    }

}
