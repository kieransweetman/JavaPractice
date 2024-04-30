package fr.algo;

// how to remove this warning? Im clearly using it
import fr.algo.UserNumberCheck;

public class MultiplicationTable {

    public static void main(String[] args) {
        int nb = UserNumberCheck.getNumberFromUser();
        printTable(nb);
    }

    public static void printTable(int nb) {
        for (int i = 1; i <= 12; i++) {
            System.out.println(nb + " x " + i + " = " + nb * i + "\n");
        }
    }
}
