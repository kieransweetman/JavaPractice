package fr.algo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserNumberCheck {

    public static Scanner scanner = new Scanner(System.in);
    public static int nb = 0;

    public static void main(String[] args) {

        do {
            try {
                System.out.println("Enter a number between 1 and 10:");
                nb = scanner.nextInt();

                if (!check(nb)) {
                    System.out.println(nb + " is not a valid number");
                }

            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number");
                scanner.next(); // Clear the invalid input
            }

        } while (!check(nb));

        scanner.close();
        System.out.println("You entered: " + nb);

    }

    public static boolean check(int nb) {
        return nb >= 1 && nb <= 10;
    }

}
