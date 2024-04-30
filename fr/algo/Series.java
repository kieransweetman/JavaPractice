package fr.algo;

public class Series {
    public static void main(String[] args){
        // loop 10
        System.out.println("printing 1-10");
        printSeries(10);

        // show only even numbers
        System.out.println("\n\nprinting 1-10: only even numbers");
        printEvenSeries(10);

        // odd numbers between 1-9;
        System.out.println("\n\nprinting 1-10: only odd numbers");
        printOddSeries(10);

        //while loop 10
        System.out.println("\n\nprinting 1-10 using while loop");
        whilePrintSeries(10);

        //while loop 10 even numbers
        System.out.println("\n\nprinting 1-10 using while loop: only even numbers");
        whilePrintEvenSeries(10);

        //while loop 10 odd numbers
        System.out.println("\n\nprinting 1-10 using while loop: only odd numbers");
        whilePrintOddSeries(10);

        
    }

    public static void printSeries(int n){
        for(int i = 1; i < n + 1; i++){
            System.out.print(i + ", ");
        }
    }

    public static void printEvenSeries(int n){
        for(int i = 1; i < n + 1; i++){
            if(i % 2 == 0){
                System.out.print(i + ", ");
            }
        }   
    }

    public static void printOddSeries(int n){
        for(int i = 1; i < n; i++){
            if(i % 2 != 0){
                System.out.print(i + ", ");
            }
        }   
    }

    public static void whilePrintSeries(int n){
        int i = 1;
        while(i < n + 1){
            System.out.print(i + ", ");
            i++;
        }
    }

    public static void whilePrintEvenSeries(int n){
        int i = 1;
        while(i < n + 1){
            if(i % 2 == 0){
                System.out.print(i + ", ");
            }
            i++;
        }
    }

    public static void whilePrintOddSeries(int n){
        int i = 1;
        while(i < n + 1){
            if(i % 2 != 0){
                System.out.print(i + ", ");
            }
            i++;
        }
    }
}
