public abstract class Person

{
    protected String name;
    protected int age;
    protected String ID;

    public Person(String name, int age, String ID)
    {
        this.name = name;
        this.age = age;
        this.ID = ID;
    }


    //Abstract method to be implemented by subclasses
    abstract void displayInfo();
}

// Interface for managing students and faculty
interface IManageable
{
    void addPerson(Person person);
    void removePerson(Person person);
    void updatePerson(Person person);
}

