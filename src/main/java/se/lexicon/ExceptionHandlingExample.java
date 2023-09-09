package se.lexicon;

import java.io.FileNotFoundException;

public class ExceptionHandlingExample {

    public static void main(String[] args) throws FileNotFoundException {
        try {
            // Code that may throw an exception
            int result = divide(10, 2);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("An arithmetic exception occurred: " + e.getMessage());
        } finally {
            // This block will always be executed
            System.out.println("Finally block executed.");
        }
        try {
            int[] numbers = {1, 2, 3};
            int result = numbers[5]; // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Array index out of bounds: " + e.getMessage());
        } catch (Exception e) {
            // Catch-all for any other exceptions
            System.err.println("An exception occurred: " + e.getMessage());
        }
        try {
            // Code that may throw an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result); // This line won't be reached if an exception occurs
        } catch (ArithmeticException e) {
            // Catch and handle the exception
            System.err.println("An arithmetic exception occurred: " + e.getMessage());
        }

        // The program continues here after handling the exception
        System.out.println("Program continues after exception handling.");
    }


    public static int divide(int dividend, int divisor) {
        // Attempt to divide the numbers
        return dividend / divisor;
    }
}
