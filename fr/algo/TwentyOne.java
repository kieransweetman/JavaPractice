package fr.algo;

import java.util.Random;
import java.util.Scanner;
f
public class TwentyOne {
    public static int player = 0;
    public static int cpu = 0;
    final static public int MAX_SUM = 21;
    final static public int MAX_MOVE = 3;
    final static public int MIN_MOVE = 1;

    public static int[] moves = new int[MAX_SUM];

    // 0 for cpu, 1 for user -> defualts to 0 but coin flip will determine who
    // goes first
    public static int nextPlayer = 0;
    public static int round = 1;
    public static boolean winner = false;

    // Scanner is a class variable to avoid creating a new scanner object every time
    // we need to get input.
    // We close the scanner at the end of the game
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(
                "\nWelcome to 21. The game is simple, you and the computer will take turns adding 1, 2 or 3 to the total. The player who reaches 21 loses. Good luck! 🍀\n");

        // determine who goes first
        coinFlip();

        moves[0] = 1;
        while (!winner) {
            playRound();

            if (getRoundSum() == MAX_SUM) {
                winner = true;
                break;
            }

            printRoundResults();

        }

        scanner.close();
        printWinner();

    }

    public static int getRoundSum() {
        int sum = 0;
        for (int move : moves) {
            sum += move;
        }
        return sum;
    }

    public static void playRound() {

        System.out.println("The total is: " + getRoundSum());

        int move = determineMoveAndUpdateScore();

        moves[round++] = move;
    }

    // set moves and return the move based on whos turn it is
    public static int determineMoveAndUpdateScore() {
        int lastMove = moves[round];
        int move = 0;
        if (nextPlayer == 1) {
            move = getPlayerMove();
            player = move + lastMove;
        } else {
            move = getCPUMove();
            cpu = move + lastMove;
        }

        return move;
    }

    public static void printRoundResults() {
        boolean isPlayersMove = nextPlayer == 1;

        if (nextPlayer == 0) {
            System.out.println("player 1  played: " + moves[round - 1]);
        } else {
            System.out.println("cpu  played: " + moves[round - 1]);
        }

        System.out.println("\n---\n");
        String message = isPlayersMove ? "Players move: " : "Computers move: ";
        System.out.println("Round " + round + ", " + message);

    }

    public static void printWinner() {
        System.out.println(player + " : " + cpu);
        if (player == MAX_SUM) {
            System.out.println("You lost 😩");
        } else {
            System.out.println("you won! 😏🥳");
        }

    }

    public static int getCPUMove() {
        Random random = new Random();
        int move = random.nextInt(3) + 1;
        if (getRoundSum() + move > MAX_SUM) {
            move = random.nextInt(2) + 1;
        }
        nextPlayer = 1;
        return move;
    }

    public static int getPlayerMove() {
        boolean invalidMove = true;
        int move = 0;

        while (invalidMove) {
            String message = "enter a move from 1 to 3";
            System.out.println(message);

            try {
                move = scanner.nextInt();

                if (move > MAX_MOVE || move < MIN_MOVE) {
                    throw new Exception();
                }

                if (getRoundSum() + move > MAX_SUM) {
                    System.out.println("\nYou can't go over 21\n");
                    continue;
                }

            } catch (Exception e) {
                System.out.println("Please enter a valid number");
                scanner.next(); // Clear the invalid input
                continue;
            }

            invalidMove = false;
        }

        nextPlayer = 0;
        return move;
    }

    public static void coinFlip() {
        Random random = new Random();
        int flip = random.nextInt(2);
        if (flip == 1) {
            System.out.println("Player 1 starts");
        } else {
            System.out.println("Player 2 starts");
        }

        nextPlayer = flip;

    }

}
