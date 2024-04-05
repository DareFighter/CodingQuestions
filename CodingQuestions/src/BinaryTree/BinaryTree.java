package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public  class BinaryTree {


    public static TreeNode<Integer> GetRootExample(){
        TreeNode<Integer> root = new TreeNode<Integer>(10);
        root.Left = new TreeNode<Integer>(20);
        root.Right = new TreeNode<Integer>(30);

        return root;
    }

    //Inorder left, root, right
    public static List<Integer> InOrderTraversal(TreeNode<Integer> root){

        List<Integer> res = new ArrayList<Integer>();

        if(root == null){
            return res;
        }

        res.addAll(InOrderTraversal(root.Left));
        res.add(root.Data);
        res.addAll(InOrderTraversal(root.Right));

        return res;
    }


    public static boolean IsSymmetric(TreeNode<Integer> root){
        return root == null || isSymmetric(root.Left, root.Right);
    }

    private static  boolean isSymmetric(TreeNode<Integer> left, TreeNode<Integer> right){
        if(left == null && right == null){
            return true;
        }

        if(left == null || right == null){
            return false;
        }

        return (left.Data == right.Data) && isSymmetric(left.Left, right.Right) && isSymmetric(left.Right, right.Left);
    }
}
