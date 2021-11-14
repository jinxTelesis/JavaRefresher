import javax.crypto.Cipher;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListDemo2 {

    public static void main(String[] args){

        List<String> cityList = Arrays.asList("Delhi","Mumbai","Bangalore");
        List<String> tempList = cityList.stream().sorted().collect(Collectors.toList());

        tempList = cityList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());




    }


}
