import java.util.ArrayList;
import java.util.List;

public class Management implements IManageable {
        private List<Person> people;
        private List<Course> courses;
        private List<Department> departments;

        public Management() {
            this.people = new ArrayList<>();
            this.courses = new ArrayList<>();
            this.departments = new ArrayList<>();
        }

        // Implementing IManageable methods
        @Override
        public void addPerson(Person person) {
            people.add(person);
        }

        @Override
        public void removePerson(String ID) {
            for (Person person : people) {
                if (person.getID().equals(ID)) {
                    people.remove(person);
                    break;
                }
            }
        }

        @Override
        public void updatePerson(Person updatedPerson) {
            for (int i = 0; i < people.size(); i++) {
                Person person = people.get(i);
                if (person.getID().equals(updatedPerson.getID())) {
                    people.set(i, updatedPerson);
                    break;
                }
            }
        }

        @Override
        public void addCourse(Course course) {
            courses.add(course);
        }

        @Override
        public void removeCourse(String courseCode) {
            for (Course course : courses) {
                if (course.getCourseCode().equals(courseCode)) {
                    courses.remove(course);
                    break;
                }
            }
        }

        @Override
        public void updateCourse(Course updatedCourse) {
            for (int i = 0; i < courses.size(); i++) {
                Course course = courses.get(i);
                if (course.getCourseCode().equals(updatedCourse.getCourseCode())) {
                    courses.set(i, updatedCourse);
                    break;
                }
            }
        }

        @Override
        public void addDepartment(Department department) {
            departments.add(department);
        }

        @Override
        public void removeDepartment(String departmentName) {
            for (Department department : departments) {
                if (department.getDepartmentName().equals(departmentName)) {
                    departments.remove(department);
                    break;
                }
            }
        }

        @Override
        public void updateDepartment(Department updatedDepartment) {
            for (int i = 0; i < departments.size(); i++) {
                Department department = departments.get(i);
                if (department.getDepartmentName().equals(updatedDepartment.getDepartmentName())) {
                    departments.set(i, updatedDepartment);
                    break;
                }
            }
        }

     public <Student> List<Student> getAllStudents() {
         List<Student> students = new ArrayList<>();
         for (Person person : people) {
             if (person != null) {
                 students.add((Student) person);
             }
         }
         return students;
     }
}


