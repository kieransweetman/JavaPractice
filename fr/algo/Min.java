package fr.algo;

public class Min {

    public static int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

    public static void main(String[] args) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("The min number in the array is: " + min);
    }

}
