package fr.algo;

import java.util.Arrays;

import fr.utils.ArrayUtils;

public class FirstLast6 {

    public static int[][] arrays = { ArrayUtils.SIX_START, ArrayUtils.SIX_END, ArrayUtils.ARRAY };

    public static void main(String[] args) {
        System.out.println("First or last number is 6");
        for (int[] arr : arrays) {
            System.out.print("\nArray: " + Arrays.toString(arr) + " -> " + firstLast6(arr));
        }
    }

    public static boolean firstLast6(int[] arr) {
        return arr.length > 0 && (arr[0] == 6 || arr[arr.length - 1] == 6);
    }

}
