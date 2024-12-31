package BinaryTree.ClassWork;
import java.util.*;
public class ProductOfTreeNodes {
    public static int product(TreeNode root){
        if(root == null) return 1;
        return root.val * product(root.left) * product(root.right);
    }
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        TreeNode h = new TreeNode(8);
        TreeNode i = new TreeNode(9);
        TreeNode j = new TreeNode(10);

        a.left = null; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = null;
        e.left = h; f.right = null;
        h.right = j;

        System.out.println(product(a)); // 3628800
    }
}
