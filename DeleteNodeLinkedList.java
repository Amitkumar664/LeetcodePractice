public class DeleteNodeLinkedList {

    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    // Function to delete given node (LeetCode logic)
    public static void deleteNode(ListNode node) {
        node.val = node.next.val;      // copy next node value
        node.next = node.next.next;   // skip next node
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

        // Create linked list: 4 -> 5 -> 1 -> 9
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);

        System.out.print("Original List: ");
        printList(head);

        // Suppose we want to delete node with value 5
        ListNode nodeToDelete = head.next; // node = 5

        deleteNode(nodeToDelete);

        System.out.print("After Deletion: ");
        printList(head);
    }
}