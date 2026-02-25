import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string
        String word = "level";

        // Create a stack
        Stack<Character> stack = new Stack<>();

        // Push characters onto the stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        // Compare characters by popping from stack
        boolean isPalindrome = true;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println("The string \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + word + "\" is not a palindrome.");
        }
    }
}