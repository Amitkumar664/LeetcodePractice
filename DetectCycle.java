class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class DetectCycle {

    public static ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null)
            return null;

        ListNode slow = head;
        ListNode fast = head;

        // Step 1: Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // Step 2: Find start of cycle
                ListNode ptr = head;

                while (ptr != slow) {
                    ptr = ptr.next;
                    slow = slow.next;
                }
                return ptr;
            }
        }

        return null;
    }

    // Helper function to print result
    public static void printResult(ListNode node) {
        if (node == null) {
            System.out.println("No cycle");
        } else {
            System.out.println("Cycle starts at node with value: " + node.val);
        }
    }

    public static void main(String[] args) {
        // Create nodes
        ListNode head = new ListNode(3);
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(0);
        ListNode n3 = new ListNode(-4);

        // Link nodes
        head.next = n1;
        n1.next = n2;
        n2.next = n3;

        // Create cycle: last node points to node with value 2
        n3.next = n1;

        ListNode result = detectCycle(head);
        printResult(result);
    }
}