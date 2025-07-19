package StringAndStringBuffer;

import java.util.Scanner;

public class StringConcatenation {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first string: ");
	        String str1 = sc.nextLine().toLowerCase();

	        System.out.print("Enter second string: ");
	        String str2 = sc.nextLine().toLowerCase();

	        if (str1.charAt(str1.length() - 1) == str2.charAt(0)) {
	            str2 = str2.substring(1);
	        }

	        String result = str1 + str2;
	        System.out.println("Result: " + result);

	        sc.close();
	}

}
