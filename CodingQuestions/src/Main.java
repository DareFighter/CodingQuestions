import Arrays.*;
import Graph.Graph;
import Greedy.FractionalKnapsack;
import LList.LRUCache;
import LList.MergeKSortedList;
import LList.Node;

import Recursion.LuckyNumber;
import Recursion.PalindromicPartition;
import Recursion.PowerOfNumbers;
import Recursion.PowerSets;
import Searching.Count;

import Sorting.CountingSort;
import Sorting.MergeSort;
import Sorting.MergeThreeSortedArray;
import Sorting.QuickSort;
import Sorting.Sort;
import Stack.LongestValidParenthesis;
import Strings.PatternSearching;
import DP.KadaneAlgorithm;
import Tree.BinaryTree;
import Tree.LLNode;
import Tree.TreeNode;
import DP.DP;

import java.lang.reflect.Array;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] onearr = { 1, 2, 3 };
        int[] twoarr = { 4, 5 };
        int[] threearr = { 5, 6 };
        int[] fourarr = { 7, 8 };
        Node one = getLLNodeFromArray(onearr);
        Node two = getLLNodeFromArray(twoarr);
        Node three = getLLNodeFromArray(threearr);
        Node four = getLLNodeFromArray(fourarr);
        List<Node> llListArr = new ArrayList<>();
        llListArr.add(one);
        llListArr.add(two);
        llListArr.add(three);
        llListArr.add(four);
        Node head = MergeKSortedList.MergeLists(llListArr);

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static Node getLLNodeFromArray(int[] arr) {
        Node head = new Node(arr[0]);
        Node temp = head;
        int i = 1;
        while (i < arr.length) {

            head.next = new Node(arr[i]);
            i++;
            head = head.next;
        }

        return temp;
    }

    public static void Print(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
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