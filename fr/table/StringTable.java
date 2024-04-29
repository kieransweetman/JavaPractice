package fr.table;

import java.util.Arrays;

public class StringTable {

    private static String[] cityArray = { "Paris", "Lyon", "Marseille", "Toulouse", "Nice" };

    public static void main(String[] args) {
        System.out.println("The cities are: ");
        StringTable.printCities();
       
        System.out.println("The length of the array is: " + cityArray.length);

        cityArray[3] = "Reims";

        System.out.println("The cities after modification are: ");
        StringTable.printCities();
    }

    public static void printCities() {
        System.out.println(Arrays.toString(cityArray));
    }
}