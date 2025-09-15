package assignment5;

import java.util.Scanner;

public class MoveUppercaseToEnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String lowercasePart = "";
        String uppercasePart = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                uppercasePart += ch;
            } else {
                lowercasePart += ch;
            }
        }

        System.out.println(lowercasePart + uppercasePart);
        scanner.close();
    }
}

