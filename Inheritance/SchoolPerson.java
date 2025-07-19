package Inheritance;

public class SchoolPerson {

	protected String name;
    protected String dateOfBirth;

    public SchoolPerson(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dateOfBirth);
    }
}
