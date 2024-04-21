import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private double GPA;
    private List<Course> enrolledCourses;

    public Student(String name, int age, String ID, double GPA) {
        super(name, age, ID);
        this.GPA = GPA;
        this.enrolledCourses = new ArrayList<>();
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
    }

    @Override
    public void displayInfo() {
        System.out.println("GPA: " + GPA);
        System.out.println("Enrolled Courses: ");
        for (Course course : enrolledCourses) {
            System.out.println(course.getCourseName() + " (" + course.getCourseCode() + ")");
        }
    }
}
