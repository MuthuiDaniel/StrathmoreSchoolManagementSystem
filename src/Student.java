public class Student extends Person {
    private double GPA;
    private List<String> coursesEnrolled;

    public Student(String name, int age, String ID, double GPA, List<String> coursesEnrolled) {
        super(name, age, ID);
        this.GPA = GPA;
        this.coursesEnrolled = coursesEnrolled;
    }

    @Override
    void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + ID);
        System.out.println("GPA: " + GPA);
        System.out.println("Courses Enrolled: " + coursesEnrolled);
    }
}
