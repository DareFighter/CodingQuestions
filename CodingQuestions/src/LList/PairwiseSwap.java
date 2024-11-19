package LList;

public class PairwiseSwap {

    public static Node pairwise_swap(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node prev = null;
        Node current = head;

        head = head.next;

        while (current != null && current.next != null) {
            Node next = current.next;
            Node nextNext = next.next;

            next.next = current;
            current = nextNext;

            // Update the previous node's next pointer, if it exists
            if (prev != null) {
                prev.next = next;
            }

            prev = current;
            current = nextNext;
        }

        return head;
    }

}
