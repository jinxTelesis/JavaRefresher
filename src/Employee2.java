public class Employee2 implements Comparable<Employee2>{
    private String lastName;
    private String firstName;
    private String empId;
    private int age;
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getEmpId() {
        return empId;
    }
    public void setEmpId(String empId) {
        this.empId = empId;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getLastName() + " " + getAge() + " " + getEmpId();
    }

    public int compareTo(Employee2 o){
        int firstCmp = this.getFirstName().compareTo(o.getFirstName());
        return firstCmp != 0 ? firstCmp : this.getLastName().compareTo(o.getFirstName());
    }


}
