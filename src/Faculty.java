public class Faculty extends Person {
    private String department;

    public Faculty(String name, int age, String ID, String department) {
        super(name, age, ID);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("ID: " + getID());
        System.out.println("Department: " + department);
    }
}
