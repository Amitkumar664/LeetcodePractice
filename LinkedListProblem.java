public class LinkedListProblem {

    // Definition for singly-linked list
    static class ListNode {
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

    // 👉 Add your function here
    public static ListNode solve(ListNode head) {
        // Example logic (you can replace this)
        return head;
    }

    // Utility function to print list
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Creating sample linked list: 1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(1,
                new ListNode(2,
                new ListNode(3,
                new ListNode(4))));

        System.out.print("Original: ");
        printList(head);

        head = solve(head);

        System.out.print("After Operation: ");
        printList(head);
    }
}
