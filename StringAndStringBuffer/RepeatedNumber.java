package StringAndStringBuffer;

import java.util.Scanner;

public class RepeatedNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        int n = input.length();  
        String firstTwo = input.length() >= 2 ? input.substring(0, 2) : input;
        String result = "";
        for (int i = 0; i < n; i++) {
            result += firstTwo;
        }
        System.out.println("Result: " + result);

        sc.close();        
	}

}
