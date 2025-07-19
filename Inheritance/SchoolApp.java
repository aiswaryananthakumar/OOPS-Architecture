package Inheritance;

public class SchoolApp {
    public static void main(String[] args) {
  
        System.out.println("Person");
        SchoolPerson p = new SchoolPerson("Alice", "01-01-1990");
        p.displayInfo();

        System.out.println("\nTeacher");
        Teacher t = new Teacher("Mr. John", "12-05-1980", 55000, "Mathematics");
        t.displayTeacherInfo();

        System.out.println("\nStudent");
        Student s = new Student("Emily", "15-08-2005", "S12345");
        s.displayStudentInfo();

        System.out.println("\nCollege Student");
        CollegeStudent cs = new CollegeStudent("David", "02-02-2003", "C98765", "ABC College", "Third");
        cs.displayCollegeStudentInfo();
    }
}
