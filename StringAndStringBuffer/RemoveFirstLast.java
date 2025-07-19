package StringAndStringBuffer;

import java.util.Scanner;

public class RemoveFirstLast {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        if (input.length() <= 2) {
            System.out.println("Result: ");
        } else {
            String result = input.substring(1, input.length() - 1);
            System.out.println("Result: " + result);
        }

        sc.close();        
	}

}
