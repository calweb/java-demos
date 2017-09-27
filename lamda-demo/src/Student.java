/**
 * Created by calvinwebster on 9/27/17.
 */
public class Student {

    private double gradePercentage;
    private String name;
    private String major;
    private String classYear;

    public Student(double gradePercentage, String name, String major, String classYear) {
        this.gradePercentage = gradePercentage;
        this.name = name;
        this.major = major;
        this.classYear = classYear;
    }

    public double getGradePercentage() {
        return gradePercentage;
    }

    public void setGradePercentage(double gradePercentage) {
        this.gradePercentage = gradePercentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getClassYear() {
        return classYear;
    }

    public void setClassYear(String classYear) {
        this.classYear = classYear;
    }

    @Override
    public String toString() {
        return "Student{" +
                "gradePercentage=" + gradePercentage +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", classYear='" + classYear + '\'' +
                '}';
    }
}
