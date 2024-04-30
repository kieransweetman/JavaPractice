package fr.algo;

public class Max {

    public static int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

    public static void main(String[] args) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("The maximum number in the array is: " + max);
    }

}
