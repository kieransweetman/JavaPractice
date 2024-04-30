package fr.algo;

import java.util.Arrays;

import fr.utils.ArrayUtils;

public class FirstLast {
    // Créer une classe FirstLast
    // • Dans cette classe, on déclare un tableau d’entiers
    // • On calcule une valeur booléenne qui contrôle le tableau de la sorte :
    // o elle vaut true si le tableau est de longueur supérieure ou égale à 1 et que
    // le
    // premier et le dernier élément du tableau ont la même valeur
    // o elle vaut false dans les autres cas
    // • écrire l’algo de valorisation de cette variable avec le minimum de ligne

    public static int[][] arrays = { ArrayUtils.FIRST_LAST, ArrayUtils.SIX_END, ArrayUtils.ARRAY, new int[0] };

    public static void main(String[] args) {
        System.out.println("array is not empty, and first & last number are the same ");
        for (int[] arr : arrays) {
            System.out.print("\nArray: " + Arrays.toString(arr) + " -> " + firstLast(arr));
        }
    }

    public static boolean firstLast(int[] arr) {
        return arr.length >= 1 && arr[0] == arr[arr.length - 1];
    }

}
