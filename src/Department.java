import java.util.ArrayList;
import java.util.List;

public class Department {
    private String departmentName;
    private List<Course> courses;
    private List<Faculty> facultyMembers;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.courses = new ArrayList<>();
        this.facultyMembers = new ArrayList<>();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public List<Faculty> getFacultyMe
