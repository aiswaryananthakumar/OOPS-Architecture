package Inheritance;

public class Student extends SchoolPerson {
    protected String studentId;

    public Student(String name, String dateOfBirth, String studentId) {
        super(name, dateOfBirth);
        this.studentId = studentId;
    }

    public void displayStudentInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
    }
}

