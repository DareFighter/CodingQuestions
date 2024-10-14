package Tree;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Recursion.PalindromicPartition;

public class BinaryTree {
    private static HashMap<Integer, Integer> inorderIndexMap;
    private static int postIndex;

    public static TreeNode<Integer> GetRootExample() {
        TreeNode<Integer> root = new TreeNode<Integer>(10);
        root.Left = new TreeNode<Integer>(20);
        root.Right = new TreeNode<Integer>(30);

        return root;
    }

    // Inorder left, root, right
    public static List<Integer> InOrderTraversal(TreeNode<Integer> root) {

        List<Integer> res = new ArrayList<Integer>();

        if (root == null) {
            return res;
        }

        res.addAll(InOrderTraversal(root.Left));
        res.add(root.Data);
        res.addAll(InOrderTraversal(root.Right));

        return res;
    }

    public static boolean IsSymmetric(TreeNode<Integer> root) {
        return root == null || isSymmetric(root.Left, root.Right);
    }

    private static boolean isSymmetric(TreeNode<Integer> left, TreeNode<Integer> right) {
        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null) {
            return false;
        }

        return (left.Data == right.Data) && isSymmetric(left.Left, right.Right) && isSymmetric(left.Right, right.Left);
    }

    public static boolean IsChildrenSumProperty(TreeNode<Integer> root) {
        if (root == null) {
            return true;
        }

        if (root.Left == null && root.Right == null) {
            return true;
        }

        int sum = 0;
        if (root.Left != null) {
            sum += root.Left.Data;
        }

        if (root.Right != null) {
            sum += root.Right.Data;
        }

        return sum == root.Data && IsChildrenSumProperty(root.Left) && IsChildrenSumProperty(root.Right);

    }

    public static int FindHeight(TreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(FindHeight(root.Left), FindHeight(root.Right));
    }

    // O(n2) implementation
    public static boolean BalancedBinaryTree(TreeNode<Integer> root) {
        if (root == null) {
            return true;
        }

        int leftHeight = 0;
        int rightHeight = 0;
        // should find the height of left subtree and height of right subtree
        // minus the height if the is <= 1 return true; else return false

        if (root.Left != null) {
            leftHeight = FindHeight(root.Left);
        }

        if (root.Right != null) {
            rightHeight = FindHeight(root.Right);
        }

        return Math.abs(rightHeight - leftHeight) <= 1 && BalancedBinaryTree(root.Left)
                && BalancedBinaryTree(root.Right);
    }

    public static int GetHeightBalanced(TreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }

        var leftHeight = GetHeightBalanced(root.Left);
        if (leftHeight == -1) {
            return -1;
        }

        var rightHeight = GetHeightBalanced(root.Right);
        if (rightHeight == -1) {
            return -1;
        }

        if (Math.abs(rightHeight - leftHeight) > 1) {
            return -1;
        }

        return 1 + Math.max(leftHeight, rightHeight);
    }

    // O(n) implementation
    public static boolean BalanceBinaryTree2(TreeNode<Integer> root) {
        var res = GetHeightBalanced(root);
        return res != -1;
    }

    public static ArrayList<Integer> LevelOrderTraversal(TreeNode<Integer> root) {
        var res = new ArrayList<Integer>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode<Integer>> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()) {
            var size = q.size();
            for (int i = 0; i < size; i++) {
                var current = q.poll();
                if (current.Left != null) {
                    q.add(current.Left);
                }
                if (current.Right != null) {
                    q.add(current.Right);
                }
            }
        }
        return res;
    }

    // Time complexity O(n)
    // Sapce complexity O(n)
    public static int GetWidthOfBT(TreeNode<Integer> root) {
        int max = 0;
        if (root == null) {
            return max;
        }

        Queue<TreeNode<Integer>> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            var size = q.size();
            max = Math.max(max, size);
            for (int i = 0; i < size; i++) {
                var curr = q.poll();

                if (curr.Left != null) {
                    q.add(curr.Left);
                }

                if (curr.Right != null) {
                    q.add(curr.Right);
                }
            }
        }

        return max;
    }

    // Time complexity O(n)
    // Space complexity O(n)

    public static ArrayList<Integer> LeftView(TreeNode<Integer> root) {
        var res = new ArrayList<Integer>();
        if (root == null) {
            return res;
        }
        var queue = new LinkedList<TreeNode<Integer>>();

        queue.add(root);
        while (!queue.isEmpty()) {
            var size = queue.size();
            for (int i = 0; i < size; i++) {
                var current = queue.poll();
                if (i == 0) {
                    res.add(current.Data);

                    if (current.Left != null) {
                        queue.add(current.Left);
                    }

                    if (current.Right != null) {
                        queue.add(current.Right);
                    }
                }
            }

        }

        return res;

    }

    public static ArrayList<Integer> RightView(TreeNode<Integer> root) {
        var res = new ArrayList<Integer>();

        if (root == null) {
            return res;
        }

        Queue<TreeNode<Integer>> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            var queueSize = queue.size();
            for (int i = 0; i < queueSize; i++) {
                var current = queue.poll();

                if (i == queueSize - 1) {
                    res.add(current.Data);
                }

                if (current.Left != null) {
                    queue.add(current.Left);
                }

                if (current.Right != null) {
                    queue.add(current.Right);
                }
            }
        }

        return res;
    }

    public static int checkHeight(TreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = checkHeight(root.Left);
        if (leftHeight == -1)
            return -1; // Not balanced

        int rightHeight = checkHeight(root.Right);
        if (rightHeight == -1)
            return -1; // Not balanced

        // If height difference is more than 1 return -1 not balanced
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        return Math.max(leftHeight, rightHeight) + 1;

    }

    public static ArrayList<Integer> findSpriral(TreeNode<Integer> root) {
        var res = new ArrayList<Integer>();
        int height = getHeight(root);
        boolean ltr = false;
        for (int i = 1; i <= height; i++) {
            addSpiralList(res, root, i, ltr);
            ltr = !ltr;
        }
        return res;
    }

    private static int getHeight(TreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = getHeight(root.Left);
        int rightHeight = getHeight(root.Right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    private static void addSpiralList(ArrayList<Integer> inRes, TreeNode<Integer> node, int level, boolean ltr) {
        if (node == null) {
            return;
        }

        if (level == 1) {
            inRes.add(node.Data);
        } else if (level > 1) {
            if (ltr) {
                addSpiralList(inRes, node.Left, level - 1, ltr);
                addSpiralList(inRes, node.Right, level - 1, ltr);
            } else {
                addSpiralList(inRes, node.Right, level - 1, ltr);
                addSpiralList(inRes, node.Left, level - 1, ltr);
            }
        }

    }

    public static TreeNode<Integer> ConvertLinkedListToBinaryTree(LLNode head, TreeNode<Integer> root) {
        if (head == null) {
            return null;
        }

        root = new TreeNode<Integer>(head.data);
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);

        var current = head.next;
        while (current != null) {
            var currentNode = queue.poll();

            TreeNode leftChild = new TreeNode<Integer>(current.data);
            currentNode.Left = leftChild;
            queue.add(leftChild);
            current = current.next;

            if (current != null) {
                TreeNode rightChild = new TreeNode<Integer>(current.data);
                currentNode.Right = rightChild;
                queue.add(rightChild);
                current = current.next;
            }

        }
        return root;

    }

    public static TreeNode<Integer> buildTree(int[] inorder, int[] postorder) {
        inorderIndexMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderIndexMap.put(inorder[i], i);
        }

        postIndex = postorder.length - 1;

        return buildTreeRecursive(inorder, postorder, 0, inorder.length - 1);
    }

    private static TreeNode<Integer> buildTreeRecursive(int[] inorder, int[] postorder, int inStart, int inEnd) {
        // Base case -> no elements to process;
        if (inStart > inEnd) {
            return null;
        }

        // Pick current root from the postorder array using postIndex
        int rootValue = postorder[postIndex--];
        TreeNode root = new TreeNode<Integer>(rootValue);

        // if this node has no children, return the node (leaf node)
        if (inStart == inEnd) {
            return root;
        }

        // Find the inorder index of this root in inorder array to divide left and right
        // subtrees
        int inorderIndex = inorderIndexMap.get(rootValue);

        // Recursively build the right subTree first(because postorder visits right
        // before left);
        root.Right = buildTreeRecursive(inorder, postorder, inorderIndex + 1, inEnd);

        root.Left = buildTreeRecursive(inorder, postorder, inStart, inorderIndex - 1);

        return root;
    }

}
