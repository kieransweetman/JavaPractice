package fr.algo;

import java.util.Arrays;

import fr.utils.ArrayUtils;

public class ArraySum {

    public static int[] array = ArrayUtils.ARRAY;
    public static int[] arrayToAdd = { -1, 12, 17, 14, 5, -9, 0, 18 };

    public static void main(String[] args) {
        int sum = 0;
        int arr1Sum = sum(array);
        int arr2Sum = sum(arrayToAdd);

        sum += arr1Sum + arr2Sum;

        System.out.println("The first array is: " + Arrays.toString(array) + " \nSum: " + arr1Sum);
        System.out.println("The second array is: " + Arrays.toString(arrayToAdd) + " \nSum: " + arr2Sum);

        System.out.println("The sum of the two arrays is: " + sum);

    }

    public static int sum(int[] arr) {
        int sum = 0;

        for (int num : array) {
            sum += num;
        }

        return sum;
    }
}
