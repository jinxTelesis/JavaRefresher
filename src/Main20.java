interface StringFunction{
    String run(String str);
}

interface StringFunction2{
    String rundumb(String str);
}

public class Main20 {

    public static void main(String[] args){
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello",exclaim);
        printFormatted("Hello",ask);
        printFormatted("Hello!!!",ask);
    }

    public static void printFormatted(String str, StringFunction format){
        String result = format.run(str);
        System.out.println(result);
    }

    public static void printFormattedDumb(String str, StringFunction2 format){
        String result = format.rundumb(str);
        System.out.println(result);
    }

}
