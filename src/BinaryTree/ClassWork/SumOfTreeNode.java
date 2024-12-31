package BinaryTree.ClassWork;

import com.sun.source.tree.Tree;

public class SumOfTreeNode {
    public static int sum;
    public static void sum1(TreeNode root){
        if(root == null) return;
        sum += root.val;
        sum1(root.left);
        sum1(root.right);
    }
    public static int sum2(TreeNode root){
        if(root == null) return 0;
        return root.val + sum2(root.left) + sum2(root.right);
    }
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(41);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(2);
        TreeNode e = new TreeNode(6);
        TreeNode f = new TreeNode(10);
        TreeNode g = new TreeNode(5);
        TreeNode h = new TreeNode(20);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        e.right = h;
        sum = 0;
        sum1(a);
        System.out.println(sum);
        System.out.println(sum2(a));
    }
}
