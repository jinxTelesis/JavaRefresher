interface StringConcat{
    public String sconcat(String a, String b);
}

public class Example4 {

    public static void main(String arg[]){
        StringConcat s = (str1, str2) -> str1 + str2;
        System.out.println("Result: " +s.sconcat("Hello ", "World"));
    }
}
