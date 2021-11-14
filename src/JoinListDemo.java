import java.util.ArrayList;
import java.util.List;

public class JoinListDemo {

    public static void main(String[] args){

        List<String> cityList = new ArrayList<String>();
        cityList.add("Delhi");
        cityList.add("Mumbai");
        cityList.add("Kolkata");

        List<String> anotherCityList = new ArrayList<String>();
        anotherCityList.add("Hyderabad");
        anotherCityList.add("Bangalore");
        anotherCityList.add("Mumbai");

        cityList.addAll(anotherCityList);

        for(String cityName: cityList){
            System.out.println("City Name" + cityName);
        }

    }

}
