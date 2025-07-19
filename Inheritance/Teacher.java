package Inheritance;

public class Teacher extends SchoolPerson {
    private double salary;
    private String subject;

    public Teacher(String name, String dateOfBirth, double salary, String subject) {
        super(name, dateOfBirth);
        this.salary = salary;
        this.subject = subject;
    }

    public void displayTeacherInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
    }
}

