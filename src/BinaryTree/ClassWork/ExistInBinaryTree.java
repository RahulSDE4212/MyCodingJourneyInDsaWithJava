package BinaryTree.ClassWork;
import java.util.*;
public class ExistInBinaryTree {
    public static boolean isExist(TreeNode root, int num){
        if(root == null) return false;
        return (root.val == num) || (isExist(root.left, num)) || (isExist(root.right, num));
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

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        e.left = h; f.right = i;
        h.right = j;

        System.out.println(isExist(a, 11));
    }
}
