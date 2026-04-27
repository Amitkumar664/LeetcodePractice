class Node {
    int val;
    Node prev, next, child;

    Node(int val) {
        this.val = val;
    }
}

public class FlattenList {

    public static Node flatten(Node head) {
        flattenDFS(head);
        return head;
    }

    private static Node flattenDFS(Node node) {
        Node curr = node;
        Node last = null;

        while (curr != null) {
            Node next = curr.next;

            if (curr.child != null) {
                Node childTail = flattenDFS(curr.child);

                // Connect curr -> child
                curr.next = curr.child;
                curr.child.prev = curr;

                // Connect childTail -> next
                if (next != null) {
                    childTail.next = next;
                    next.prev = childTail;
                }

                curr.child = null;
                last = childTail;
            } else {
                last = curr;
            }

            curr = next;
        }

        return last;
    }

    // Print list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create sample:
        // 1 - 2 - 3
        //         |
        //         7 - 8
        Node head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n7 = new Node(7);
        Node n8 = new Node(8);

        head.next = n2;
        n2.prev = head;

        n2.next = n3;
        n3.prev = n2;

        n3.child = n7;
        n7.next = n8;
        n8.prev = n7;

        System.out.print("Flattened List: ");
        head = flatten(head);
        printList(head);
    }
}