package fr.algo;

import java.util.InputMismatchException;
import java.util.Scanner;

import fr.algo.UserNumberCheck;

public class UserSum {
    public static Scanner scanner = new Scanner(System.in);
    public static int nb = 0;

    public static void main(String[] args) {
        int nb = getNumberFromUser();
        int sum = getSum(nb);
        System.out.println("the sum of 1 to " + nb + " is " + sum);

    }

    public static int getSum(int nb) {
        int sum = 0;
        for (int i = 1; i <= nb; i++) {
            sum += i;
        }
        return sum;
    }

    public static boolean check(int nb) {
        return UserNumberCheck.check(nb);
    }

    public static int getNumberFromUser() {

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

        return nb;

    }

}
