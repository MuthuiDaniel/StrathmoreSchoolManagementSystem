import java.util.List;

public class Faculty extends Person {
    private String department;
    private List<String> coursesTaught;

    public Faculty(String name, int age, String ID, String department) {
        super(name, age, ID);
        this.department = department;
        this.coursesTaught = coursesTaught;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + ID);
        System.out.println("Department: " + department);
        System.out.println("Courses Taught: " + coursesTaught);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<String> getCoursesTaught() {
        return coursesTaught;
    }

    public void setCoursesTaught(List<String> coursesTaught) {
        this.coursesTaught = coursesTaught;
    }
}
