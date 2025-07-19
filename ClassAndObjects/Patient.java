package ClassAndObjects;

import java.util.Scanner;

public class Patient {
	String patientName;
    double height; 
    double weight; 
    Patient(String name, double height, double weight) {
        this.patientName = name;
        this.height = height;
        this.weight = weight;
    }
    double computeBMI() {
        return weight / (height * height);
    }

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter patient name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter height in meters: ");
	        double height = sc.nextDouble();

	        System.out.print("Enter weight in kg: ");
	        double weight = sc.nextDouble();
	        
	        Patient p = new Patient(name, height, weight);
	        double bmi = p.computeBMI();

	        System.out.println("Patient Name: " + p.patientName);
	        System.out.println("BMI: " + bmi);

	        sc.close();
	}

}
