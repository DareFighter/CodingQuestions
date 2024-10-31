package LList;

import java.util.HashSet;

public class DetectLoop {

    public static boolean detectLoopUsingHashing(Node head) {
        HashSet<Node> set = new HashSet<>();

        while (head != null) {

            if (set.contains(head.next)) {
                return true;
            }

            set.add(head);
            head = head.next;
        }

        return false;
    }

    public static boolean detectLoop(Node head) {
        Node temp = new Node(0);

        while (head != null) {
            // This condition is for the case
            // Where there is no loop

            if (head.next == null) {
                return false;
            }

            // Check if next is already
            // pointing to the temp
            if (head.next == temp) {
                return true;
            }

            // Store the pointer to the next node
            // in order to get to it in the next step
            Node next = head.next;
            head.next = temp;
            head = next;
        }

        return false;
    }

    public static boolean detectLoopUsingFloydCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (slow != null && fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

}
