package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // Creating a List of integers using ArrayList implementation
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);  // Adding number 10 to the list
        numbers.add(20);  // Adding number 20 to the list
        numbers.add(30);  // Adding number 30 to the list
        numbers.add(20);  // Adding number 20 again (duplicate)
        numbers.add(40);  // Adding number 40 to the list
        numbers.add(50);  // Adding number 50 to the list
        numbers.add(30);  // Adding number 30 again (duplicate)

        try {
            // Creating a Set of integers to remove duplicates from the list
            Set<Integer> uniqueNumbers = new HashSet<>(numbers);

            int sum = 0;  // Initializing a variable to hold the sum of unique numbers

            // Iterating through the set of unique numbers and summing them up
            for (int num : uniqueNumbers) {
                sum += num;
            }

            // Calculating the average of unique numbers
            double average = sum / (double) uniqueNumbers.size();

            // Printing the original list with possible duplicates
            System.out.println("Original list: " + numbers);
            // Printing the list after removing duplicates
            System.out.println("List without duplicates: " + uniqueNumbers);
            // Printing the sum of unique numbers
            System.out.println("Sum: " + sum);
            // Printing the average of unique numbers
            System.out.println("Average: " + average);

        } catch (ArithmeticException | IllegalArgumentException e) {
            // Catching any arithmetic or illegal argument exceptions that may occur and printing an error message
            System.err.println("An error occurred: " + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            // Catching index out of bounds exception and printing an error message
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            // Executing code in the finally block, which runs regardless of exceptions
            System.out.println("Operation completed.");
        }

        try {
            // Attempting to access an element at index 100, which will cause an IndexOutOfBoundsException
            System.out.println(numbers.get(100));
        } catch (IndexOutOfBoundsException e) {
            // Catching the exception and printing an error message
            System.err.println("Index out of bounds: " + e.getMessage());
        }

        try {
            // Creating an empty list
            List<Integer> emptyList = new ArrayList<>();
            int sum = 0;  // Initializing a variable to hold the sum

            // Iterating through the empty list (this loop will not run)
            for (int num : emptyList) {
                sum += num;
            }

            // Attempting to calculate the average, which will cause a division by zero
            double average = sum / (double) emptyList.size();
        } catch (ArithmeticException e) {
            // Catching the arithmetic exception (division by zero) and printing an error message
            System.err.println("Arithmetic error: " + e.getMessage());
        } finally {
            // Executing code in the finally block, which runs regardless of exceptions
            System.out.println("Operation completed with empty list.");
        }
    }
}
