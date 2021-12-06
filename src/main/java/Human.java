import java.util.ArrayList;

public class Human {
    private String name;
    private String fathersName;
    private String surname;
    private int age;

    public Human(String name, String fathersName, String surname, int age) {
        this.name = name;
        this.fathersName = fathersName;
        this.surname = surname;
        this.age = age;
    }

    public Human(Human h) {
        this.name = h.name;
        this.surname = h.surname;
        this.fathersName = h.fathersName;
        this.age = h.age;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFathersName() {
        return fathersName;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;

        Human human = (Human) o;

        if (getAge() != human.getAge()) return false;
        if (!getName().equals(human.getName())) return false;
        if (!getSurname().equals(human.getSurname())) return false;
        return getFathersName().equals(human.getFathersName());

    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getSurname().hashCode();
        result = 31 * result + getFathersName().hashCode();
        result = 31 * result + getAge();
        return result;
    }
}
