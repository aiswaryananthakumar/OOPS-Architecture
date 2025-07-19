package ClassAndObjects;

import java.util.Scanner;

public class Calculator {
	static int powerInt(int num1, int num2) {
        return (int)Math.pow(num1, num2);
    }
    static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int intBase = sc.nextInt();
        int intExp = sc.nextInt();
        System.out.println("Result: " + powerInt(intBase, intExp));

        System.out.print("Enter a value: ");
        double doubleBase = sc.nextDouble();
        int doubleExp = sc.nextInt();
        System.out.println("Result: " + powerDouble(doubleBase, doubleExp));

        sc.close();

	}

}
