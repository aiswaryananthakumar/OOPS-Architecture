package StringAndStringBuffer;

import java.util.Scanner;

public class RemoveStarAndAdjacent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (i > 0 && input.charAt(i - 1) == '*') {
                continue;
            }
            if (input.charAt(i) == '*') {
                continue;
            }
            if (i < input.length() - 1 && input.charAt(i + 1) == '*') {
                continue;
            }

            result.append(input.charAt(i));
        }
        System.out.println("Result: " + result.toString());

        sc.close();
    }
}
