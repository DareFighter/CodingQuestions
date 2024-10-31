package LList;

public class RemoveLoop {

    public static void removeLoop(Node head) {

        if (head == null || head.next == null)
            return;

        Node slow = head, fast = head;

        // Detect loop using Floyd's cycle-finding algorithm
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) { // Loop detected
                break;
            }
        }

        // If loop exists, proceed to remove it
        if (slow == fast) {
            slow = head;
            // Find the start of the loop
            if (slow == fast) { // Special case if the loop starts at the head
                while (fast.next != slow) {
                    fast = fast.next;
                }
            } else {
                while (slow.next != fast.next) {
                    slow = slow.next;
                    fast = fast.next;
                }
            }
            // Remove the loop
            fast.next = null;
        }
    }

}
