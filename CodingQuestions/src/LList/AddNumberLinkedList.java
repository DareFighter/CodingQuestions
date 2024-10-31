package LList;

public class AddNumberLinkedList {

    public static Node addTwoLists(Node num1, Node num2) {
        num1 = reverseList(num1);
        num2 = reverseList(num2);

        Node dummyHead = new Node(0);
        Node current = dummyHead;
        int carry = 0;

        while (num1 != null || num2 != null | carry != 0) {
            int sum = carry;
            if (num1 != null) {
                sum += num1.data;
                num1 = num1.next;
            }

            if (num2 != null) {
                sum += num2.data;
                num2 = num2.next;
            }

            carry = sum / 10;
            current.next = new Node(sum % 10);
            current = current.next;
        }

        return reverseList(dummyHead.next);
    }

    public static Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

}
