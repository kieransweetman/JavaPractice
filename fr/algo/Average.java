package fr.algo;

public class Average {
    public static int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

    public static void main(String[] args) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = (double) sum / array.length;
        System.out.println("The average of the array is: " + average);
    }
}
