package fr.algo;

import java.util.Arrays;

public class Reverse {
    public static int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

    public static void main(String[] args) {

        // print all elements in the array using a loop
        System.out.println("printing all elements in the array using a loop");
        for (int num : array) {
            System.out.print(num + ", ");
        }

        // print all elements in the array in reverse order
        System.out.println("\n\nprinting array in reverse order");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + ", ");
        }

        // copy the array
        int[] arrayCopy = array.clone();
        System.out.println("\n\nprinting arrayCopy");
        System.out.println(Arrays.toString(arrayCopy));
    }

    /*
     * • Afficher l’ensemble des éléments dans l’ordre inverse du tableau
     * • Créer un tableau arrayCopy et copier tous les éléments de array dans
     * arrayCopy
     * 
     * 
     */
}
