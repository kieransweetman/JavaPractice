package fr.algo;

import fr.algo.UserNumberCheck;

public class NextTen {

    public static void main(String[] args) {
        int nb = UserNumberCheck.getNumberFromUser();
        printNextTen(nb);
    }

    public static void printNextTen(int nb) {
        for (int i = 0; i <= 10; i++) {
            System.out.println((nb + i) + "\n");
        }
    }

}
