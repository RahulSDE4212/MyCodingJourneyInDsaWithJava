package BinaryTree.ClassWork;
import java.util.*;
public class ProductOfNon_ZeroTreeNodes {
    public static int product(TreeNode root){
        if(root == null) return 1;
        if(root.val == 0) return product(root.left) * product(root.right);
        return root.val * product(root.left) * product(root.right);
    }
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(0);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(0);
        TreeNode f = new TreeNode(0);
        TreeNode g = new TreeNode(0);
        TreeNode h = new TreeNode(0);
        TreeNode i = new TreeNode(0);
        TreeNode j = new TreeNode(0);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        e.left = h; f.right = i;
        h.right = j;

        System.out.println(product(a));
    }
}
