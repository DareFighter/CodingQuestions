package Tree;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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


    public static boolean IsChildrenSumProperty(TreeNode<Integer> root){
        if(root == null){
            return true;
        }

        if(root.Left == null && root.Right == null){
            return true;
        }

        int sum = 0;
        if(root.Left != null){
            sum += root.Left.Data;
        }

        if(root.Right != null){
            sum += root.Right.Data;
        }

        return sum == root.Data && IsChildrenSumProperty(root.Left) && IsChildrenSumProperty(root.Right);

    }


    public static  int FindHeight(TreeNode<Integer> root){
        if(root == null){
            return 0;
        }

        return 1 + Math.max(FindHeight(root.Left),FindHeight(root.Right));
    }


    //O(n2) implementation
    public static boolean BalancedBinaryTree(TreeNode<Integer> root){
        if(root == null){
            return true;
        }

        int leftHeight = 0;
        int rightHeight = 0;
        // should find the height of left subtree and height of right subtree
        // minus the height if the is <= 1 return true; else return false

        if(root.Left != null){
            leftHeight = FindHeight(root.Left);
        }

        if(root.Right != null){
            rightHeight = FindHeight(root.Right);
        }

        return Math.abs(rightHeight -leftHeight) <= 1 && BalancedBinaryTree(root.Left) && BalancedBinaryTree(root.Right);
    }


    public static int GetHeightBalanced(TreeNode<Integer> root){
        if(root == null){
            return 0;
        }

        var leftHeight = GetHeightBalanced(root.Left);
        if(leftHeight == -1){
            return -1;
        }

        var rightHeight = GetHeightBalanced(root.Right);
        if(rightHeight == -1){
            return -1;
        }

        if(Math.abs(rightHeight - leftHeight) > 1){
            return -1;
        }

        return 1 + Math.max(leftHeight, rightHeight);
    }
    //O(n) implementation
    public static boolean BalanceBinaryTree2(TreeNode<Integer> root){
        var res = GetHeightBalanced(root);
        return res != -1;
    }

    public static ArrayList<Integer> LevelOrderTraversal(TreeNode<Integer> root){
        var res = new ArrayList<Integer>();
        if(root == null){
            return res;
        }
        Queue<TreeNode<Integer>> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){
            var size = q.size();
            for(int i = 0; i < size; i++){
                var current = q.poll();
                if(current.Left != null){
                    q.add(current.Left);
                }
                if(current.Right != null){
                    q.add(current.Right);
                }
            }
        }
        return res;
    }


    //Time complexity O(n)
    //Sapce complexity O(n)
    public static int GetWidthOfBT(TreeNode<Integer> root){
        int max = 0;
        if(root == null){
            return max;
        }

        Queue<TreeNode<Integer>> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            var size = q.size();
            max = Math.max(max, size);
            for(int i = 0; i < size; i++){
                var curr = q.poll();

                if(curr.Left != null){
                    q.add(curr.Left);
                }

                if(curr.Right != null){
                    q.add(curr.Right);
                }
            }
        }

        return max;
    }
}
