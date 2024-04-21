public class Course {
    private String courseName;
    private String courseCode;
    private Faculty assignedFaculty;
    private List<Student> enrolledStudents;

    public Course(String courseName, String courseCode, Faculty assignedFaculty) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.assignedFaculty = assignedFaculty;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Faculty getAssignedFaculty() {
        return assignedFaculty;
    }

    public void setAssignedFaculty(Faculty assignedFaculty) {
        this.assignedFaculty = assignedFaculty;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }
}
