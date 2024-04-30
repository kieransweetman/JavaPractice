package fr.algo;

public class WallBuilder {

    public static void main(String[] args) {
        // Tests de vérification
        check(3, 1, 8, true);
        check(3, 1, 9, false);
        check(3, 2, 10, true);
        check(3, 2, 8, true);
        check(3, 2, 9, false);
        check(6, 1, 11, true);
        check(6, 0, 11, false);
        check(1, 4, 11, true);
        check(0, 3, 10, true);
        check(1, 4, 12, false);
        check(3, 1, 7, true);
        check(1, 1, 7, false);
    }

    static boolean buildWall(int nbSmall, int nbBig, int longueur) {
        boolean resultat = false;
        return resultat;
    }

    private static void check(int nbSmall, int nbBig, int size, boolean b) {
        if (!buildWall(nbSmall, nbBig, size) == b) {
            System.err.println("Test (" + nbSmall + ", " + nbBig + ", " +
                    size + ") NON passant.");
        }
    }

}
