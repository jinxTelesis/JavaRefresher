import java.util.ArrayList;
import java.util.List;

interface IMyInterface{
    Person getRef(String firstName, String lastName, int age, char gender);
}

public class LambdaExpressionDemo {

    public static void main(String[] args){

    }


    private static List<Person> createList(){
        List<Person> tempList = new ArrayList<Person>();
        IMyInterface createObj = Person::new;
        Person person = createObj.getRef("Ram","Tiwari", 50, 'M');
        tempList.add(person);
        person = createObj.getRef("Prem", "Chopra", 13, 'M');
        tempList.add(person);
        person = createObj.getRef("Tanuja", "Trivedi", 30, 'F');
        tempList.add(person);
        person = createObj.getRef("Manoj", "Sharma", 40, 'M');
        tempList.add(person);
        System.out.println("List elements are - ");
        System.out.println(tempList);
        return tempList;
    }
}
