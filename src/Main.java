public class Main {
    public static void main(String[] args) {
        try {
            // Create management system
            Management management = new Management();

            // Add faculty, students, and department to management system
            Faculty faculty = (Faculty) management.addPerson(new Faculty("John Doe", 40, "F001", "Computer Science"));
            Student student1 = (Student) management.addPerson(new Student("Alice Smith", 20, "S001", 3.8));
            Student student2 = (Student) management.addPerson(new Student("Bob Johnson", 21, "S002", 3.5));
            Department department = management.addDepartment(new Department("Computer Science"));

            // Create courses
            Course course1 = management.addCourse(new Course("Java Programming", "CS101", faculty));
            Course course2 = management.addCourse(new Course("Database Management", "CS102", faculty));

            // Add faculty and courses to department
            department.addFacultyMember(faculty);
            department.addCourse(course1);
            department.addCourse(course2);

            // Enroll students in courses
            student1.enrollCourse(course1);
            student2.enrollCourse(course2);

            // Update student information
            String studentID = "S001";
            String newName = "Alice Johnson";
            int newAge = 21;
            management.updatePerson(studentID, newName, newAge);

            // Display information
            System.out.println("Department: " + department.getDepartmentName());
            System.out.println("Faculty: " + faculty.getName() + ", Department: " + faculty.getDepartment());
            System.out.println("Courses in department:");
            for (Course course : department.getCourses()) {
                System.out.println(course.getCourseName() + " (" + course.getCourseCode() + ")");
            }
            System.out.println("Students enrolled in courses:");
            for (Course course : department.getCourses()) {
                System.out.println(course.getCourseName() + ":");
                for (Student student : course.getEnrolledStudents()) {
                    System.out.println("- " + student.getName() + " (GPA: " + student.getGPA() + ")");
                }
            }
        } catch (InvalidDataException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
