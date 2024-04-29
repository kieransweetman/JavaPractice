package fr.table;

public class table {

    private static int[] intArray = { 8, -7, 12, 1, -2, 14, 17, 9};

    public static void main(String[] args) {
        System.out.println("The length of the array is: " + intArray.length);
        System.out.println("The first element of the array is: " + intArray[0]);
        System.out.println("The last element of the array is: " + intArray[intArray.length - 1]);
        System.out.println(" This will throw an ArrayIndexOutOfBoundsException because the array's length is 8, so the valid indices are 0 to 7. Index 10 is out of this range.");
        System.out.println("The element at index 10 is: " + intArray[10]);
    }
}


