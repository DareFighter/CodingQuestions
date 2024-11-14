package LList;

public class YIntersection {

    public static int intersectPoint(Node head1, Node head2) {
        int len1 = getLength(head1);
        int len2 = getLength(head2);

        Node longer = len1 > len2 ? head1 : head2;
        Node shorter = len1 > len2 ? head2 : head1;
        int difference = Math.abs(len1 - len2);

        for (int i = 0; i < difference; i++) {
            longer = longer.next;
        }

        while (longer != null && shorter != null) {
            if (longer == shorter) {
                return longer.data;
            }
            longer = longer.next;
            shorter = shorter.next;
        }

        return -1;
    }

    public static int getLength(Node head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }

}
