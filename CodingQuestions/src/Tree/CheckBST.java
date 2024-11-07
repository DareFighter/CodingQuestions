package Tree;

public class CheckBST {

    public static boolean checkBST(TreeNode<Integer> root) {
        return isBSTHelper(root, null, null);
    }

    private static boolean isBSTHelper(TreeNode<Integer> root, Integer min, Integer max) {
        if (root == null) {
            return true;
        }

        if (min != null && root.Data <= min || max != null && root.Data >= max) {
            return false;
        }

        return isBSTHelper(root.Left, min, root.Data) && isBSTHelper(root.Right, root.Data, max);
    }

}
