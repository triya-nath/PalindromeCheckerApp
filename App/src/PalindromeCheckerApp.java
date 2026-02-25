public class PalindromeCheckerApp {

    // Node class for singly linked list
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    // Convert string to linked list
    private static Node stringToLinkedList(String word) {
        Node head = null, tail = null;
        for (char ch : word.toCharArray()) {
            Node newNode = new Node(ch);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }

    // Reverse linked list
    private static Node reverseList(Node head) {
        Node prev = null, current = head, next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    // Check palindrome
    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        Node slow = head, fast = head;
        // Find middle
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node secondHalf = reverseList(slow.next);
        Node firstHalf = head;

        // Compare halves
        Node p1 = firstHalf, p2 = secondHalf;
        boolean palindrome = true;
        while (p2 != null) {
            if (p1.data != p2.data) {
                palindrome = false;
                break;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        // Optional: restore the second half
        slow.next = reverseList(secondHalf);

        return palindrome;
    }

    public static void main(String[] args) {
        String word = "madam";
        Node head = stringToLinkedList(word);

        if (isPalindrome(head)) {
            System.out.println("The string \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + word + "\" is not a palindrome.");
        }
    }
}