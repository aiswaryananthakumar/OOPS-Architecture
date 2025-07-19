package StringAndStringBuffer;

import java.util.Scanner;

public class RepeatLastN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.print("Enter n (0 to " + input.length() + "): ");
        int n = sc.nextInt();
        if (n < 0 || n > input.length()) {
            System.out.println("Invalid value of n.");
        } else {
            String lastN = input.substring(input.length() - n);
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < n; i++) {
                result.append(lastN);
            }
            System.out.println("Result: " + result.toString());
        }

        sc.close();
    }
}

