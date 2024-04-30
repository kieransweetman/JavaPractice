package fr.algo;

public class Partial {

    // Créer une classe AffichagePartiel
    // • Combiner une boucle et un test de manière à n’afficher que les entiers
    // supérieurs à 3
    // • Combiner une boucle et un test de manière à n’afficher que les entiers
    // pairs
    // • Combiner une boucle et un test de manière à n’afficher que les valeurs
    // correspondant
    // aux index pairs
    // • Combiner une boucle et un test de manière à n’afficher que les entiers
    // impairs

    public static int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

    public static void main(String[] args) {
        System.out.println("printing all elements in the array using a loop");
        for (int num : array) {
            System.out.print(num + ", ");
        }

        System.out.println("\n\nprinting only numbers greater than 3");
        greaterThanThree();

        System.out.println("\n\nprinting only even whole numbers");
        evenWholeNumbers();

        System.out.println("\n\nprinting only odd whole numbers");
        oddWholeNumbers();

        System.out.println("\n\nprinting only even index");
        evenIndex();
    }

    public static void greaterThanThree() {
        for (int num : array) {
            if (num > 3) {
                System.out.print(num + ", ");
            }
        }
    }

    public static void evenWholeNumbers() {
        for (int num : array) {
            if (num % 2 == 0 && num > 0) {
                System.out.print(num + ", ");
            }
        }
    }

    public static void oddWholeNumbers() {
        for (int num : array) {
            if (num % 2 != 0 && num > 0) {
                System.out.print(num + ", ");
            }
        }
    }

    public static void evenIndex() {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.print("index: " + i + " -> eee" + array[i] + ",\n ");
            }
        }
    }

}
