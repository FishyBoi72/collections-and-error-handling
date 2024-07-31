package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);
        numbers.add(50);
        numbers.add(30);

        try {
            Set<Integer> uniqueNumbers = new HashSet<>(numbers);

            int sum = 0;
            for (int num : uniqueNumbers) {
                sum += num;
            }

            double average = sum / (double) uniqueNumbers.size();

            System.out.println("Original list: " + numbers);
            System.out.println("List without duplicates: " + uniqueNumbers);
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);

        } catch (ArithmeticException | IllegalArgumentException e) {
            System.err.println("An error occurred: " + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("Operation completed.");
        }

        try {
            System.out.println(numbers.get(100));
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Index out of bounds: " + e.getMessage());
        }

        try {
            List<Integer> emptyList = new ArrayList<>();
            int sum = 0;
            for (int num : emptyList) {
                sum += num;
            }
            double average = sum / (double) emptyList.size();
        } catch (ArithmeticException e) {
            System.err.println("Arithmetic error: " + e.getMessage());
        } finally {
            System.out.println("Operation completed with empty list.");
        }
    }
}