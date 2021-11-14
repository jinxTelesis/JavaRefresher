import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesDemo {

    public static void main(String[] args){
        List<String> cityList = new ArrayList<>();
        cityList.add("Delhi");
        cityList.add("Mumbai");
        cityList.add("Bangalore");
        cityList.add("Chennai");
        cityList.add("Kolkata");

        cityList = cityList.stream().distinct().collect(Collectors.toList());

        for(String name: cityList){
            System.out.println("City Name - " + name);
        }
    }

}
