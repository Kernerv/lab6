public class Student extends Human {
    private String department;

    public Student(String name, String secondName, String fathersName, int age, String department) {
        super(name, secondName, fathersName, age);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}