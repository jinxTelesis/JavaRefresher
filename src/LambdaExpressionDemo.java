import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

interface IMyInterface{
    Person getRef(String firstName, String lastName, int age, char gender);
}

public class LambdaExpressionDemo {

    public static void main(String[] args){

        List<Person> personList = createList();

        // comparator implementation as anonymous class
        // and sorting the list element on the basis of first name
        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });

        System.out.println("Sorted list with anonymous implementation");

        for(Person p: personList){
            System.out.println(p.getFirstName() + " ");
        }

        personList = createList();

        // Providing the comparator function interface compare
        Collections.sort(personList, (Person a, Person b) ->
                a.getFirstName().compareTo(b.getFirstName()));

        personList.forEach((per) -> System.out.println(per.getFirstName()));
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
