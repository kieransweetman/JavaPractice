package fr.algo;

import java.util.Random;
import java.util.Scanner;

public class TwentyOne {
    public static int player = 0;
    public static int cpu = 0;
    public static int lastMove = 1;
    public static boolean winner = false;
    public static boolean isPlayersTurn = false;

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(
                "Welcome to 21. The game is simple, you and the computer will take turns adding 1, 2 or 3 to the total. The player who reaches 21 loses. Good luck! 🍀");

        // determine who goes first
        coinFlip();

        while (!winner) {
            game();
        }

        scanner.close();
        printWinner();

    }

    public static void game() {
        if (isPlayersTurn) {
            player = getPlayerMove();
            cpu = getCPUMove();
        } else {
            cpu = getCPUMove();
            player = getPlayerMove();
        }
        System.out.println("Player 1: " + player);
        System.out.println("Player 2: " + cpu);

        if (lastMove == 21) {
            winner = true;
        }

    }

    public static void printWinner() {

        if (player == 21) {
            System.out.println("You lost 😩");
        } else {
            System.out.println("you won! 😏🥳");
        }

    }

    public static int getCPUMove() {
        Random random = new Random();
        int end = lastMove >= 19 ? 21 : lastMove + 3;
        int start = Math.min(lastMove + 1, end);
        int move = random.nextInt((end - start) + 1) + start;
        lastMove = move;
        return (int) move;
    }

    public static int getPlayerMove() {
        boolean invalidMove = true;
        int move = 0;
        int range = lastMove >= 19 ? 21 : lastMove + 3;

        // break if last move was 20 , since theres only one choise left
        if (lastMove == 20) {
            return 21;
        }

        while (invalidMove) {
            String message = "enter a move from " + (lastMove + 1) + " to " + range;
            System.out.println(message);

            try {
                move = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Please enter a valid number");
                scanner.next(); // Clear the invalid input
                continue;
            }

            if (move > range || move <= lastMove) {
                System.out.println("Invalid move");
                continue;
            }

            invalidMove = false;
        }

        lastMove = move;
        return (int) move;
    }

    public static void coinFlip() {
        Random random = new Random();
        int flip = random.nextInt(1);

        if (flip == 0) {
            System.out.println("Player 1 starts");
            player = 1;
            isPlayersTurn = true;
        } else {
            System.out.println("Player 2 starts");
            cpu = 1;
        }
    }

}
