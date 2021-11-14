@FunctionalInterface
interface MyFunctionalInterface2{
    public int increamentByFive(int a);
}

public class Example3 {

    public static void main(String args[]){
        MyFunctionalInterface2 f = (num) -> num+5;
        System.out.println(f.increamentByFive(22));

    }

}
