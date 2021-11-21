import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CHMAtomicDemo {

    public void main(String[] arg){

        ConcurrentHashMap<String, Integer> wordMap = new ConcurrentHashMap<>();


        List<String> mapped = Stream.of("hello","world")
                .map(word -> word + "!")
                .collect(Collectors.toList());

        String result = Stream.of("hello","world")
                .reduce("", (a,b) -> b + "-" + a);

        String result1 = Stream.of("hello","world")
                .reduce("", (a,b) -> combineWithoutTrailingDash(a,b));

        // this is a method reference
        String result3 = Stream.of("hello","world")
                .reduce("", this::combineWithoutTrailingDash);


        //BiFunction allows us to use parameters of different types

        List<String> list1 = Arrays.asList("a","b","c");
        List<Integer> list2 = Arrays.asList(1,2,3);

        List<String> result4 = new ArrayList<>();

        for(int i =0; i < list1.size();i++){
            result4.add(list1.get(i) + list2.get(i));
        }


        List<Double> list3 = Arrays.asList(1.0d,2.1d,3.3d);
        List<Float> list4 = Arrays.asList(0.1f,0.2f,4f);

        List<Boolean> result5 = listCombiner(list3,list4,this::firstIsGreaterThanSecond);

        List<Float> list6 = Arrays.asList(0.1f,0.2f,4f);
        List<Float> list7 = Arrays.asList(0.1f,0.2f,4f);

        List<Boolean> result6 = listCombiner(list1, list2, (a, b) -> a.equals(b));

        //List<Boolean> result7 = listCombiner(list1,list2, Float::equals);

        List<Double> list11 = Arrays.asList(1.0d,2.1d,3.3d);
        List<Double> list22 = Arrays.asList(0.1d,0.2d,4d);

        List<Integer> result10 = listCombiner(list11,list22,Double::compareTo);



    }

    private boolean firstIsGreaterThanSecond(Double a, Float b){
        return a > b;
    }

    private static <T,U, R> List<R> listCombiner(List<T> list1, List<U> list2, BiFunction<T, U, R> combiner) {
            List<R> result = new ArrayList<>();
            for (int i = 0; i < list1.size();i++){
                result.add(combiner.apply(list1.get(i), list2.get(i)));
            }
            return result;
    }


    private String combineWithoutTrailingDash(String a, String b){
        if(a.isEmpty()){
            return b;
        }
        return b + "-" + a;
    }



}
