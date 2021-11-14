import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortObjectList {

    public static void main(String[] args){
        List<Employee> empList = new ArrayList<Employee>();

        Collections.sort(empList, new MyComparator());

    }


    private static Employee getData(String empId, String lastName, String firstName, int age){
        Employee employee = new Employee();
        employee.setEmpId(empId);
        employee.setLastName(lastName);
        employee.setFirstName(firstName);
        employee.setAge(age);
        return employee;
    }


}

class MyComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        int firstCmp = o1.getFirstName().compareTo(o2.getFirstName());
        if(firstCmp == 0){
            int lastCmp = o1.getLastName().compareTo(o2.getLastName());
            if(lastCmp == 0){
                return (o2.getAge() < o1.getAge() ? -1 :
                        (o2.getAge() == o1.getAge() ? 0 : 1));
            }else{
                return lastCmp;
            }

        }else{
            return firstCmp;
        }
    }
}
