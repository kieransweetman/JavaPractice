package fr.algo;

import java.util.Arrays;

public class ReverseContent {
    // • Créer un tableau arrayCopy et copier tous les éléments de array dans
    // arrayCopy mais
    // dans l’ordre inverse.
    // • Afficher l’ensemble des éléments des 2 tableaux

    public static int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

    public static void main(String[] args) {
        // before copy
        System.out.println("before:");
        System.out.println(Arrays.toString(array));

        // copy the array to a collection and reverse it, returning an array;
        int[] arrayCopy = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[array.length - 1 - i];
        }

        // after copy and reversed
        System.out.println("\nafter:");
        System.out.println(Arrays.toString(arrayCopy));

    }

}
