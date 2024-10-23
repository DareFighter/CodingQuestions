import Arrays.*;
import Graph.Graph;
import LList.LRUCache;
import Recursion.PalindromicPartition;
import Recursion.PowerOfNumbers;
import Recursion.PowerSets;
import Searching.ColumSortedMatrix;
import Searching.Count;
import Sorting.MergeSort;
import Sorting.MergeThreeSortedArray;
import Sorting.QuickSort;
import Sorting.Sort;
import Strings.PatternSearching;
import DP.KadaneAlgorithm;
import Tree.BinaryTree;
import Tree.LLNode;
import Tree.TreeNode;
import DP.DP;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                { 3, 30, 38 },
                { 36, 43, 60 },
                { 40, 51, 69 }
        };

        int target = 69;
        boolean isTargetPresent = ColumSortedMatrix.searchElement(matrix, 3, 3, target);
        System.out.println("Is Target Present: " + isTargetPresent);
    }

    public static void Print(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void printBinaryTree(TreeNode<Integer> root) {
        if (root == null) {
            return;
        }

        System.out.println(root.Data);
        printBinaryTree(root.Left);
        printBinaryTree(root.Right);
    }

    public static TreeNode<Integer> BinaryTree() {
        TreeNode<Integer> root = new TreeNode<Integer>(-1);
        LLNode head = ConstructLinkedList();
        var res = BinaryTree.ConvertLinkedListToBinaryTree(head, root);

        return res;

    }

    private static LLNode ConstructLinkedList() {
        LLNode head = new LLNode(1);
        head.next = new LLNode(2);
        head.next.next = new LLNode(3);
        head.next.next.next = new LLNode(4);
        head.next.next.next.next = new LLNode(5);

        return head;
    }
}