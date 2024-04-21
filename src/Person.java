public abstract class Person {
    protected String name;
    protected int age;
    protected String ID;

    public Person(String name, int age, String ID) {
        this.name = name;
        this.age = age;
        this.ID = ID;
    }

    // Abstract method to be implemented by subclasses
    abstract void displayInfo();

    public String getID() {
        return ID;
    }
}

