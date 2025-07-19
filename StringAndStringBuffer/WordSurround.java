package StringAndStringBuffer;

import java.util.Scanner;

public class WordSurround {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the main string (a): ");
        String a = sc.nextLine();

        System.out.print("Enter the pattern string (b): ");
        String b = sc.nextLine();

        StringBuilder result = new StringBuilder();
        int index = 0;

        while ((index = a.indexOf(b, index)) != -1) {
            if (index > 0) {
                result.append(a.charAt(index - 1));
            }
            if (index + b.length() < a.length()) {
                result.append(a.charAt(index + b.length()));
            }
            index += b.length();
        }
        System.out.println("Result: " + result.toString());

        sc.close();
    }
}

