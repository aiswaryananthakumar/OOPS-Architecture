package Inheritance;

import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter annual salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter start year: ");
        int year = sc.nextInt();

        sc.nextLine(); 
        System.out.print("Enter national insurance number: ");
        String insurance = sc.nextLine();

        Employee emp = new Employee(name, salary, year, insurance);

        System.out.println("\nEmployee Details");
        emp.displayInfo();

        sc.close();
    }
}

