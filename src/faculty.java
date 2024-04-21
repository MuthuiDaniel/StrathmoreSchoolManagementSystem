public class Faculty extends Person {
    private String department;
    private List<String> coursesTaught;

    public Faculty(String name, int age, String ID, String department, List<String> coursesTaught) {
        super(name, age, ID);
        this.department = department;
        this.coursesTaught = coursesTaught;
    }

    @Override
    void displayInfo() {
        System.out.println("Faculty Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + ID);
        System.out.println("Department: " + department);
        System.out.println("Courses Taught: " + coursesTaught);
    }
}