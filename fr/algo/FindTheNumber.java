package fr.algo;

import fr.algo.UserNumberCheck;

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
        int input = getUserNumber();
        int numberToFind = randomNumber();
        int moves = 0;

        while (input != numberToFind) {

            if (input < numberToFind) {
                System.out.println("num is higher");
                moves++;
                continue;
            } else if (input > numberToFind) {
                System.out.println("num is lower");
                moves++;
                continue;
            } else {
                System.out.println("You found the number");
                break;
            }

        }

        System.out.println("Congrats, you found the number in " + moves + " moves");
    }

    public static int randomNumber() {
        return (int) (Math.random() * 100) + 1;
    }

    public static int getUserNumber() {
        int nb = UserNumberCheck.getNumber();
        return nb;
    }

}
