interface IManageable {
    void addPerson(Person person);
    void removePerson(String ID);
    void updatePerson(Person person);
    void addCourse(Course course);
    void removeCourse(String courseCode);
    void updateCourse(Course course);
    void addDepartment(Department department);
    void removeDepartment(String departmentName);
    void updateDepartment(Department department);
}