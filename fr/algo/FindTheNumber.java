package fr.algo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FindTheNumber {

    // EXERCICE INTERACTIFPLUSMOINS
    // Créer une classe InteractifPlusMoins
    // Ecrire un jeu qui :
    // - choisit un nombre aléatoire entre 1 et 100
    // - puis demande à l’utilisateur de trouver ce nombre en lui indiquant s’il est
    // au-dessus ou
    // en dessous du nombre,
    // - Lorsque l’utilisateur a trouvé le nombre, le programme affiche « Bravo,
    // vous avez
    // trouvé en N coups » où N repré

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nb = 0;
        int numberToFind = randomNumber();
        int moves = 0;

        System.out.println("Enter a number between 1 and 100:");
        while (nb != numberToFind) {
            nb = getUserNumber(scanner);

            if (nb < numberToFind) {
                System.out.println("num is higher");
                moves++;
                continue;
            } else if (nb > numberToFind) {
                System.out.println("num is lower");
                moves++;
                continue;
            } else {
                System.out.println("You found the number");
                break;
            }

        }

        System.out.println("Congrats, you found the number in " + moves + " moves");
        System.out.println("The number was: " + numberToFind);

    }

    public static int getUserNumber(Scanner scanner) {
        int nb = 0;
        do {
            try {
                nb = scanner.nextInt();

                if (!check(nb)) {
                    System.out.println(nb + " is not a between 1-100 number");
                }

            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number");
                scanner.next(); // Clear the invalid input
            }

        } while (!check(nb));

        return nb;

    }

    public static boolean check(int nb) {
        return nb >= 1 && nb <= 100;
    }

    public static int randomNumber() {
        return (int) (Math.random() * 100) + 1;
    }

}
