import java.util.ArrayList;
import java.util.List;

public class Management implements IManageable {
    private List<Person> persons;

    public Management() {
        this.persons = new ArrayList<>();
    }

    @Override
    public void addPerson(Person person) {
        persons.add(person);
    }

    @Override
    public void removePerson(String ID) {
        persons.removeIf(person -> person.ID.equals(ID));
    }

    @Override
    public void updatePerson(Person person) {
        public void updatePerson(String ID, String newName, int newAge) {
            for (Person person : persons) {
                if (person.getID().equals(ID)) {
                    person.setName(newName);
                    person.setAge(newAge);
                    break;
                }
            }
        }

    }

    @Override
    public void addCourse(Course course) {

    }

    @Override
    public void removeCourse(String courseCode) {

    }

    @Override
    public void updateCourse(Course course) {

    }

    @Override
    public void addDepartment(Department department) {

    }

    @Override
    public void removeDepartment(String departmentName) {

    }

    @Override
    public void updateDepartment(Department department) {

    }

    //methods for managing courses, faculty, and departments
    public void addCourseToDepartment(Course course, Department department) {
        department.addCourse(course);
    }

    public void addFacultyToDepartment(Faculty faculty, Department department) {
        department.addFacultyMember(faculty);
    }
}

