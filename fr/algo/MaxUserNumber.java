package fr.algo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MaxUserNumber {
    public static int[] userNumbers = new int[10];

    public static void main(String[] args) {
        System.out.println("You will enter 10 numbers");
        Scanner scanner = new Scanner(System.in);

        // scanner will be here so we can get mulitple inputs
        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                System.out.println("Enter a number between 1 and 10:");
            }

            int nb = getUserNumber(scanner);
            userNumbers[i] = nb;
        }

        // closing scanner after the loop
        scanner.close();

        int max = getMaxNumber();
        System.out.println("The biggest number is: " + max);
    }

    public static int getUserNumber(Scanner scanner) {
        int nb = 0;
        do {
            try {
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

    public static int getMaxNumber() {
        int max = userNumbers[0];
        for (int num : userNumbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static boolean check(int nb) {
        return UserNumberCheck.check(nb);
    }

}
