package fr.algo;

import fr.utils.ArrayUtils;

public class FirstLast6 {

    public static void main(String[] args) {
        System.out.println(firstLast6(ArrayUtils.SIX_START));
        System.out.println(firstLast6(ArrayUtils.SIX_END));
        System.out.println(firstLast6(ArrayUtils.ARRAY));
    }

    public static boolean firstLast6(int[] arr) {
        return arr.length > 0 && (arr[0] == 6 || arr[arr.length - 1] == 6);
    }

}
