import java.util.Objects;

public class Student {

    private String firstName;
    private String lastName;
    private int groupNumber;
    private int age;
    private int solvedTask;
    private String experience;
    private String target;
    private static int solvedTastForAll;


        public Student(String firstName, String lastName, int age) {
                    }




    public static void main(String[] args) {
        Student sveta = new Student("sveta", "sokolova", 25);
        System.out.println(sveta.toString());

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
}

