// Created Management class
import java.util.ArrayList;
import java.util.List;

//Class Managements implements Imanageable
public class Management implements IManageable {
    private final List<Person> persons;
    private final List<Course> courses;
    private final List<Department> departments;

    public Management() {
        this.persons = new ArrayList<>();
        this.courses = new ArrayList<>();
        this.departments = new ArrayList<>();
    }

    @Override
    public Person addPerson(Person person) {
        persons.add(person);
        return person;
    }

    @Override
    public void removePerson(String ID) {
        persons.removeIf(person -> person.getID().equals(ID));
    }

    @Override
    public void updatePerson(String ID, String newName, int newAge) throws InvalidDataException {
        for (Person person : persons) {
            if (person.getID().equals(ID)) {
                person.setName(newName);
                person.setAge(newAge);
                return;
            }
        }
        throw new InvalidDataException("Person with ID " + ID + " not found.");
    }

    @Override
    public Course addCourse(Course course) {
        courses.add(course);
        return course;
    }

    @Override
    public void removeCourse(String courseCode) {
        courses.removeIf(course -> course.getCourseCode().equals(courseCode));
    }

    @Override
    public void updateCourse(Course updatedCourse) {
        for (int i = 0; i < courses.size(); i++) {
            Course course = courses.get(i);
            if (course.getCourseCode().equals(updatedCourse.getCourseCode())) {
                courses.set(i, updatedCourse);
                return;
            }
        }
    }

    @Override
    public Department addDepartment(Department department) {
        departments.add(department);
        return department;
    }

    @Override
    public void removeDepartment(String departmentName) {
        departments.removeIf(department -> department.getDepartmentName().equals(departmentName));
    }

    @Override
    public void updateDepartment(Department updatedDepartment) {
        for (int i = 0; i < departments.size(); i++) {
            Department department = departments.get(i);
            if (department.getDepartmentName().equals(updatedDepartment.getDepartmentName())) {
                departments.set(i, updatedDepartment);
                return;
            }
        }
    }
}
