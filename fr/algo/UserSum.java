package fr.algo;

import fr.algo.UserNumberCheck;

public class UserSum {

    public static void main(String[] args) {
        int nb = UserNumberCheck.getNumberFromUser();
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

}
