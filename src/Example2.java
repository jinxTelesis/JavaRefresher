@FunctionalInterface
interface MyFunctionalInterface{
    public String sayHello();
}

public class Example2 {

    public static void main(String args[]){
        MyFunctionalInterface msg = () ->{
            return "Hello";
        };

        System.out.println(msg.sayHello());
    }
}
