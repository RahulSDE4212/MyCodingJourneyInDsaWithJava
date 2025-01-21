package Binary_Search_Tree.Class_Work;
import java.util.*;
public class InorderPredecessorAndSuccessor {
    public static TreeNode prev;
    public static TreeNode prevToPrev;
    public static TreeNode pred;
    public static TreeNode sucd;
    public static void inorder(TreeNode root, ArrayList<TreeNode> arr){
        if(root == null) return;
        inorder(root.left, arr);
        arr.add(root);
        inorder(root.right, arr);
    }
    public static void inorder2(TreeNode root, TreeNode target){
        if(root == null) return;
        inorder2(root.left, target);
        prevToPrev = prev;
        prev = root;
        if(prev == target) pred = prevToPrev;
        if(prevToPrev == target) sucd = prev;
        inorder2(root.right, target);
    }
    public static TreeNode predecessor(TreeNode target){
        TreeNode pre = target.left;
        while(pre != null && pre.right != null) pre = pre.right;
        return pre;
    }
    public static TreeNode successor(TreeNode target){
        TreeNode suc = target.right;
        while(suc != null && suc.left != null) suc = suc.left;
        return suc;
    }
    public static void main(String[] args) {
        TreeNode a = new TreeNode(50);
        TreeNode b = new TreeNode(30);
        TreeNode c = new TreeNode(70);
        TreeNode d = new TreeNode(20);
        TreeNode e = new TreeNode(40);
        TreeNode f = new TreeNode(60);
        TreeNode g = new TreeNode(80);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;

        /* ********************  Method-1: using inorder traversal and an arraylist **************** */
//        ArrayList<TreeNode> arr = new ArrayList<>();
//        inorder(a, arr);
//        TreeNode node = g;
//        int index = 0;
//        while(arr.get(index) != node) index++;
//        TreeNode pred = (index == 0) ? null : arr.get(index - 1);
//        TreeNode sucd = (index == arr.size() - 1) ? null : arr.get(index + 1);
//        System.out.println("The predecessor of " + node.val + " is " + ((pred == null) ? " null " : pred.val));
//        System.out.println("The successor of " + node.val + " is " + ((sucd == null) ? " null " : sucd.val));

        /* **************************  Method-2: using inorder and previous node *********************** */
//        prev = null;
//        inorder2(a, c);
//        System.out.println("The predecessor of " + g.val + " is " + ((pred == null) ? " null " : pred.val));
//        System.out.println("The successor of " + g.val + " is " + ((sucd == null) ? " null " : sucd.val));

        /* ***************  Method-3: when predecessor, successor is on the level below it********************* */
        TreeNode pred = predecessor(a);
        TreeNode sucd = successor(a);
        System.out.println("The predecessor of " + a.val + " is " + ((pred == null) ? " null " : pred.val));
        System.out.println("The successor of " + a.val + " is " + ((sucd == null) ? " null " : sucd.val));
    }
}
