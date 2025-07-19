package StringAndStringBuffer;

import java.util.Scanner;

public class RemoveX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = input;

        if (result.startsWith("x")) {
            result = result.substring(1);
        }

        if (result.endsWith("x")) {
            result = result.substring(0, result.length() - 1);
        }

        System.out.println("Result: " + result);

        sc.close();
    }
}

