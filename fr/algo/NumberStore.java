package fr.algo;

public class NumberStore {
    // Créer une classe InteractifStockageNombre
    // Faire un programme avec le menu suivant :
    // 1. Ajouter un nombre
    // 2. Afficher les nombres existants.
    // Description :
    // Demander à l’utilisateur de choisir une option dans le menu.
    // 8
    // Si l’utilisateur sélectionne l’option 1, le programme demande un nombre à
    // l’utilisateur puis
    // l’ajoute à un tableau.
    // Si l’utilisateur sélectionne l’option 2, le programme affiche le contenu du
    // tableau.
    // Si le tableau est plein, écrire un algorithme pour agrandir le tableau.

    public static void main(String[] args) {
        int[] numbers = new int[0];
        int index = 0;
        int choice = 0;

        do {
            System.out.println("1. Add a number");
            System.out.println("2. Display numbers");
            System.out.println("3. Exit");
            choice = UserNumberCheck.scanner.nextInt();

            switch (choice) {
                case 1:
                    if (index == numbers.length) {
                        numbers = expandArray(numbers);
                    }
                    System.out.println("Enter a number:");
                    numbers[index] = UserNumberCheck.scanner.nextInt();
                    index++;
                    break;
                case 2:
                    for (int i = 0; i < index; i++) {
                        System.out.println("\n Numbers added: ");
                        for (int n : numbers) {
                            System.out.print(n + ", ");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 3:
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

        } while (choice != 3);

    }

    public static int[] expandArray(int[] array) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

}
