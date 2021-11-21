import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@FunctionalInterface
interface IMyFunc{
    Person getRef(String firstName, String lastName, int age, char gender);
}

public class LambdaDemo {

    public static void main(String args[]){
        List<Person> personList = createList();
        ListPerson listPerson = new ListPerson();

        Predicate<Person> allDrivers = p -> p.getAge() >= 16;

        Predicate<Person> allVoters = p -> p.getAge() >= 18;

        Predicate<Person> allSeniorCitizens = p -> p.getAge() >= 60;

        listPerson.listDrivers(personList, allDrivers);

        listPerson.listVoters(personList, allVoters);

        listPerson.listSeniorCitizens(personList, allSeniorCitizens);
    }

    private static List<Person> createList(){
        List<Person> tempList = new ArrayList<Person>();
        // Constructor reference
        IMyFunc createObj = Person::new;
        Person person = createObj.getRef("Ram","Tiwari", 50, 'M');
        tempList.add(person);
        person = createObj.getRef("Prem", "Chopra", 13, 'M');
        tempList.add(person);
        person = createObj.getRef("Tanuja", "Trivedi", 30, 'F');
        tempList.add(person);
        person = createObj.getRef("Manoj", "Sharma", 40, 'M');
        tempList.add(person);
        person = createObj.getRef("John", "Trevor", 70, 'M');
        tempList.add(person);
        person = createObj.getRef("Alicia", "Sliver", 17, 'F');
        tempList.add(person);
        System.out.println("List elements are - ");
        System.out.println(tempList);
        return tempList;
    }
}

class ListPerson{
    public void listDrivers(List<Person> personList, Predicate<Person> pred){
        List<Person> driverList = new ArrayList<Person>();
        for(Person person: personList){
            if (pred.test(person)){
                driverList.add(person);
            }
        }
        System.out.println("List of drivers");
        printList(driverList);
    }

    // method to list voters
    public void listVoters(List<Person> personList, Predicate<Person> pred){
        List<Person> voterList = new ArrayList<>();
        for(Person person: personList){
            if(pred.test(person)){
                voterList.add(person);
            }
        }
        System.out.println("List of voters");
        printList(voterList);
    }

    public void listSeniorCitizens(List<Person> personList, Predicate<Person> pred){
        List<Person> seniorCitizenList = new ArrayList<Person>();
        for(Person person: personList){
            if (pred.test(person)){
                seniorCitizenList.add(person);
            }
        }
    }

    // Method used for printing the lists
    private void printList(List<Person> personList){
        personList.forEach((p) -> System.out.print(" FirstName - " + p.getFirstName()
                + " LastName - " + p.getLastName() + " Age - " + p.getAge()));
        System.out.println("");
    }
}
