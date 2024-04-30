package fr.algo;

import java.util.Arrays;
import fr.utils.ArrayUtils;

public class TableComparison {

    // • Ecrire le code permettant de compter le nombre d’éléments en commun dans
    // ces 2
    // tableaux

    public static int[] array = ArrayUtils.ARRAY;
    public static int[] array2 = { 3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8 };

    public static void main(String[] args) {
        System.out.println("Array 1: " + Arrays.toString(array));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("The number of common elements in the two arrays is: " + commonNumbers());
    }

    public static int commonNumbers() {
        int count = 0;
        boolean[] counted1 = new boolean[array.length];
        boolean[] counted2 = new boolean[array2.length];

        for (int i = 0; i < array.length; i++) {

            if (counted1[i])
                continue;

            for (int j = 0; j < array2.length; j++) {
                if (counted2[j])
                    continue;
                if (array[i] == array2[j]) {
                    count++;
                    counted1[i] = true;
                    counted2[j] = true;
                    break;
                }
            }
        }
        return count;
    }

}
