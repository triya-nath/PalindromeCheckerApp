
import java.util.Scanner;
import java.util.Stack;

// PalindromeChecker class (Encapsulation)
class PalindromeChecker {

    // Method to check palindrome
    public boolean checkPalindrome(String input) {

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));

import java.util.*;

public class PalindromePerformance {

    // Method 1: Using String Reverse
    public static boolean reverseMethod(String input) {

        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }

    // Method 2: Using Stack
    public static boolean stackMethod(String input) {

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return input.equals(reversed);
    }

    // Method 3: Using Deque
    public static boolean dequeMethod(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {

            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }

        }

        String reversed = "";

        // Pop characters to create reversed string
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        // Compare original and reversed string
        return input.equals(reversed);
    }

}


// Main class
public class PalidromeCheckerApp {

// Main Class
public class PalindromeCheckerApp {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();


        // Reverse Method
        long start1 = System.nanoTime();
        boolean result1 = reverseMethod(input);
        long end1 = System.nanoTime();
        long time1 = end1 - start1;


        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("The string is a Palindrome");
        } else {
            System.out.println("The string is NOT a Palindrome");
        }


        System.out.println("Choose Strategy:");
        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");


        // Stack Method
        long start2 = System.nanoTime();
        boolean result2 = stackMethod(input);
        long end2 = System.nanoTime();
        long time2 = end2 - start2;

        // Deque Method
        long start3 = System.nanoTime();
        boolean result3 = dequeMethod(input);
        long end3 = System.nanoTime();
        long time3 = end3 - start3;

        System.out.println("\nPalindrome Results:");
        System.out.println("Reverse Method: " + result1 + " | Time: " + time1 + " ns");
        System.out.println("Stack Method: " + result2 + " | Time: " + time2 + " ns");
        System.out.println("Deque Method: " + result3 + " | Time: " + time3 + " ns");


        sc.close();
    }
}