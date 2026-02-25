// UC2: Palindrome Checker - Hardcoded Example
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // Hardcoded string to check
        String word = "madam";

        // Reverse the string
        String reversedWord = new StringBuilder(word).reverse().toString();

        // Check if the original string equals its reverse
        if (word.equals(reversedWord)) {
            System.out.println("\"" + word + "\" is a palindrome.");
        } else {
            System.out.println("\"" + word + "\" is not a palindrome.");
        }
    }
}