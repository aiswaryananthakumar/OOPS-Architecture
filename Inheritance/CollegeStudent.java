package Inheritance;

public class CollegeStudent extends Student {
    private String collegeName;
    private String yearOfStudy; 

    public CollegeStudent(String name, String dateOfBirth, String studentId, String collegeName, String yearOfStudy) {
        super(name, dateOfBirth, studentId);
        this.collegeName = collegeName;
        this.yearOfStudy = yearOfStudy;
    }

    public void displayCollegeStudentInfo() {
        super.displayStudentInfo();
        System.out.println("College Name: " + collegeName);
        System.out.println("Year of Study: " + yearOfStudy);
    }
}

