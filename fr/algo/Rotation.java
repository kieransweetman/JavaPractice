package fr.algo;

import java.util.Arrays;
import fr.utils.ArrayUtils;

public class Rotation {

    // Créer une classe Rotation
    // • Dans cette classe, on déclare un tableau d’entiers
    // • Effectuez une rotation à droite des éléments.
    // • Exemple : si vous avez {0,1,2,3} vous obtenez {3,0,1,2}

    public static final int[] array = { 1, 2, 3, 4 };
    public static final int[][] testArrays = { ArrayUtils.SIX_START, ArrayUtils.SIX_END, ArrayUtils.FIRST_LAST, array };

    public static void main(String[] args) {

        for (int[] testArray : testArrays) {
            int[] rotatedArray = rotateRight(testArray);
            System.out.println("Rotate array to the right");
            System.out.println("Array: " + Arrays.toString(testArray));
            System.out.println("Rotated array: " + Arrays.toString(rotatedArray));
        }
    }

    public static int[] rotateRight(int[] arr) {
        int[] rotatedArray = new int[arr.length];
        int last = arr[arr.length - 1];
        rotatedArray[0] = last;
        for (int i = 1; i < arr.length; i++) {
            rotatedArray[i] = arr[i - 1];
        }

        return rotatedArray;
    }

}
