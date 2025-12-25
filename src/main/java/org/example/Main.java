package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1
        int number;
        while (true) {
            System.out.print("Enter a number: ");
            try {
                number = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }

        if (number > 7) {
            System.out.println("Hello");
        }

        // Task 1.2
        System.out.print("Enter a name: ");
        String name = scanner.next();
        if ("John".equals(name)) {
            System.out.println("Hello, John");
        } else {
            System.out.println("There is no such name");
        }

        // Task 1.3
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter numbers for the array (press q to finish):"); // any non-integer would stop but for simplicity just used q
        while (scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }

        System.out.println("Multiples of 3:");
        numbers.stream().
                filter(n -> n % 3 == 0).
                forEach(System.out::println);
        scanner.close();

        /*Task 2

        Answer the questions
        Given bracket sequence: [((())()(())]]
        Can this sequence be considered correct?
        If the answer to the previous question is “no”, then what needs to be changed in it to make it correct?

        Answer: No, it can't be considered correct. Type mismatch: ( closed by ] + Invalid nesting order

        The minimal fix is to change ] at 12th index to )
        [((())()(()))]

         */
    }
}