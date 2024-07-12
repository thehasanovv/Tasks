package classtasks.sort2;

import java.util.Collections;
import java.util.List;

import static classtasks.sort2.Util.getStudents;

public class StudentApp {
    public static void main(String[] args) {
        List<Student> students = getStudents();
        Collections.sort(students);
//        Collections.sort(students, new Compare());
        System.out.println(students);
    }
}
