package fr.algo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserNumberCheck {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nb = 0;

        do {
            try {
                System.out.println("Enter a number between 1 and 10:");
                nb = scanner.nextInt();

                if (!check(nb)) {
                    System.out.println(nb + " is not a valid number");
                    continue;
                }

                System.out.println("You entered: " + nb);
                scanner.close();

            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number");
                scanner.next(); // Clear the invalid input
            }

        } while (!check(nb));
    }

    public static boolean check(int nb) {
        return nb >= 1 && nb <= 10;
    }

}
