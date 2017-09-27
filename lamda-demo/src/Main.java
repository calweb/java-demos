import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by calvinwebster on 9/27/17.
 */
public class Main {
    public static void main(String[] args) {
        List<Student> students = buildStudentList();

        for(Student stud : students) {
            System.out.println(stud);
        }
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getGradePercentage() > o2.getGradePercentage()) {
                    return 1;
                } else if (o2.getGradePercentage() > o1.getGradePercentage()){
                    return -1;
                } else {
                    return 0;
                }

            }
        });
        System.out.println();
        for(Student stud : students) {
            System.out.println(stud);
        }

        students.sort(((o1, o2) -> o1.getName().compareTo(o2.getName())));

        System.out.println();

        for(Student stud : students) {
            System.out.println(stud);
        }
        System.out.println("---- streams.........");

        double sumOfTopStuds = students.stream()
                .filter(s -> s.getGradePercentage() > 3.0)
                .mapToDouble(s -> s.getGradePercentage())
                .sum();
        System.out.println(sumOfTopStuds);

    }

    public static List buildStudentList () {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(3.9, "Chris", "Java", "Senior"));
        studentList.add(new Student(3.0, "Chad", "Java", "Sophomore"));
        studentList.add(new Student(2.0, "Phil", "Good Times", "Senior XL"));
        studentList.add(new Student(1.0, "Calvin", "JavaScript", "Senior"));
        studentList.add(new Student(3.5, "Stephen", "Java", "Junior"));
        studentList.add(new Student(3.2, "Patrick", "Robots", "Senior"));
        studentList.add(new Student(3.8, "Josh", "Good Times", "Freshman"));
        studentList.add(new Student(4.0, "Spencer", "Algorithms", "Professor"));

        return studentList;
    }


}
