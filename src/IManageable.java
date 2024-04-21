interface IManageable {
    Person addPerson(Person person);
    void removePerson(String ID);
    void updatePerson(String ID, String newName, int newAge) throws InvalidDataException;
    Course addCourse(Course course);
    void removeCourse(String courseCode);
    void updateCourse(Course course);
    Department addDepartment(Department department);
    void removeDepartment(String departmentName);
    void updateDepartment(Department department);
}