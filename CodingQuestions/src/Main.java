import Arrays.*;
import Graph.Graph;
import Hashing.LongestConsecutiveSub;
import Hashing.PositiveNegativePair;
import Hashing.TripletSum;
import LList.LRUCache;
import Recursion.LuckyNumber;
import Recursion.PalindromicPartition;
import Recursion.PossibleWords;
import Recursion.PowerOfNumbers;
import Recursion.PowerSets;
import Recursion.Practice;
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
        int[] arr = { 1, 9, 3, 10, 4, 20, 2 };

        int longestConsecutiveSubSeq = LongestConsecutiveSub.findLongesetConseqSubSeq(arr);
        System.out.print("Longest consecutive sub sequence: " + longestConsecutiveSubSeq);
        System.out.println();
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