public class PalindromeCheckerApp {

    // Recursive method to check palindrome
    public static boolean isPalindrome(String word, int start, int end) {
        // Base condition: crossed pointers
        if (start >= end) return true;

        // Check current characters
        if (word.charAt(start) != word.charAt(end)) return false;

        // Recursive call
        return isPalindrome(word, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String word = "racecar";

        if (isPalindrome(word, 0, word.length() - 1)) {
            System.out.println("The string \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + word + "\" is not a palindrome.");
        }
    }
}