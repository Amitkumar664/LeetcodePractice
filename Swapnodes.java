// Definition for singly-linked list
class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Solution {

    public ListNode deleteNode(ListNode head, int target) {
        // Dummy node to handle edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode current = dummy;

        while (current.next != null) {
            if (current.next.val == target) {
                current.next = current.next.next; // delete node
                break;
            }
            current = current.next;
        }

        return dummy.next;
    }

    // Helper function to print list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method for testing
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Creating linked list: 1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(1,
                new ListNode(2,
                new ListNode(3,
                new ListNode(4))));

        System.out.println("Original List:");
        printList(head);

        head = sol.deleteNode(head, 3);

        System.out.println("After Deletion:");
        printList(head);
    }
} 