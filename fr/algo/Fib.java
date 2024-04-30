package fr.algo;

import java.util.Arrays;
import java.util.InputMismatchException;

public class Fib {

    public static void main(String[] args) {
        TestFib.run();
    }

    public static class TestFib {
        public static void run() {
            int range = 0;
            String message = "Enter a number to get the Fibonacci sequence:\n";
            System.out.println(message);

            while (range <= 0) {
                try {
                    range = UserNumberCheck.scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Please enter a valid number");
                    UserNumberCheck.scanner.next(); // Clear the invalid input
                }

            }

            System.out.println(Arrays.toString(fibonacci(range)));
        }

        public static int[] fibonacci(int range) {
            int[] fib = new int[range];

            for (int i = 0; i < fib.length; i++) {
                if (i == 0) {
                    fib[i] = 0;
                } else if (i == 1) {
                    fib[i] = 1;
                } else {
                    fib[i] = fib[i - 1] + fib[i - 2];
                }
            }

            return fib;
        }

    }

}
