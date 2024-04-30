package fr.algo;

import java.util.Scanner;

import fr.algo.UserNumberCheck;

public class MaxUserNumber {
    public static int[] userNumbers = new int[10];
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("You will enter 10 numbers");
        for (int i = 0; i < 10; i++) {
            userNumbers[i] = getNumberFromUser();
        }
        scanner.close();
        int max = getMaxNumber();
        System.out.println("le plus grand nombre est " + max);
    }

    public static int getNumberFromUser() {
        System.out.println("Enter a number between 1 and 10:");
        return scanner.nextInt();
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

}
