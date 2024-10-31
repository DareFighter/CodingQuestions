package LList;

public class FlattenLinkedList {

    public static FlattenNode flatten(FlattenNode root) {
        // Your code here

        if (root == null || root.next == null) {
            return root;
        }

        // Recursively flatten the next sublist
        root.next = flatten(root.next);

        // Merge the current sublist with the flattened next sublist
        root = mergeTwoLists(root, root.next);

        return root;
    }

    public static FlattenNode mergeTwoLists(FlattenNode a, FlattenNode b) {
        if (a == null)
            return b;
        if (b == null)
            return a;

        FlattenNode result;

        // Select the smaller value node and link the rest recursively
        if (a.data < b.data) {
            result = a;
            result.bottom = mergeTwoLists(a.bottom, b);
        } else {
            result = b;
            result.bottom = mergeTwoLists(a, b.bottom);
        }

        result.next = null; // Ensure that 'next' pointers are removed in the final flattened list
        return result;
    }

}
