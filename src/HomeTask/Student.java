package HomeTask;

import java.util.Objects;



public class Student {

    private String firstName;
    private String lastName;
    private int groupNumber;
    private int age;
    private int solvedTask;
    private String experience;
    private String target;
    private static int solvedTaskForAll;
    Discipline discipline = Discipline.JAVA;


    public Student(String firstName, String lastName, int age) {
    }




    public static void main(String[] args) {
        Student sveta = new Student("sveta", "sokolova", 25);
        System.out.println();

    }

    public enum Discipline {
        JAVA,
        ANDROID,
        PYTHON,
        WEB,
        UX,
        PROJECT_MANAGEMENT;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return groupNumber == student.groupNumber &&
                age == student.age &&
                Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, groupNumber, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", groupNumber=" + groupNumber +
                ", age=" + age +
                ", solvedTask=" + solvedTask +
                ", experience='" + experience + '\'' +
                ", target='" + target + '\'' +
                '}';
    }
}

