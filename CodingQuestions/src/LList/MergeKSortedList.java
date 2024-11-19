package LList;

import java.util.*;

public class MergeKSortedList {

    public static Node MergeLists(List<Node> arr) {
        if (arr == null || arr.isEmpty()) {
            return null;
        }

        PriorityQueue<Node> minHeap = new PriorityQueue<>((a, b) -> a.data - b.data);

        for (var head : arr) {
            if (head != null) {
                minHeap.add(head);
            }
        }

        Node dummy = new Node(-1);
        Node tail = dummy;

        while (!minHeap.isEmpty()) {
            var smallest = minHeap.poll();
            tail.next = smallest;
            tail = tail.next;

            if (smallest.next != null) {
                minHeap.add(smallest.next);
            }
        }

        return dummy.next;
    }

}
