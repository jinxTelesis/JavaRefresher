import java.util.HashMap;

public class Main6 {

    public static void main(String [] args){
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("england","London");
        capitalCities.put("Germany","Berlin");
        capitalCities.put("Normay","Oslo");
        capitalCities.put("USA","Washington DC");

        System.out.println(capitalCities);

        capitalCities.get("England");

        for (String i: capitalCities.keySet()){
            System.out.println(i);
        }

        for (String i: capitalCities.values()){
            System.out.println(i);
        }

        for (String i: capitalCities.keySet()){
            System.out.println("key: " + i + " value" + capitalCities.get(i));


        }
    }
}
