import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Asdsd", "math");
        Student student2 = new Student("Ydfvg", "chem");
        Student student3 = new Student("Hsdfa", "math");
        Student student4 = new Student("Basdd", "math");
        Student student5 = new Student("Dascfa", "chem");
        Student student6 = new Student("Sfgbhdg", "bio");

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        System.out.println(students);

        String[] a = {"dfss", "sfsf"};

        List<Student> sortedByNameAndCourse = students.stream()
                .filter(e1 -> e1.course = "math")
                .sorted((e1, e2) -> e1.course - e2.course)
                .collect(Collectors.toCollection());

        System.out.println(sortedByNameAndCourse);



    }
}
