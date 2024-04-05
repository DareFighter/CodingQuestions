import BinaryTree.BinaryTree;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var root = BinaryTree.GetRootExample();
        var res = BinaryTree.InOrderTraversal(root);
        System.out.println(res.toString());
    }


}