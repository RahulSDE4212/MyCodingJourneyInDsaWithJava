package Week_21_HeapsAndPriorityQueue.Heaps;

import java.util.ArrayList;

public class _18_ConvertBSTIntoMaxHeap {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static void inorder(TreeNode root, ArrayList<Integer> arr){
        if(root == null) return;
        inorder(root.right, arr);
        arr.add(root.val);
        inorder(root.left, arr);
    }
    public static void main(String[] args) {
        TreeNode a = new TreeNode(10);
        TreeNode b = new TreeNode(5);
        TreeNode c = new TreeNode(15);
        TreeNode d = new TreeNode(3);
        TreeNode e = new TreeNode(7);
        TreeNode f = new TreeNode(12);
        TreeNode g = new TreeNode(18);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;

        ArrayList<Integer> arr = new ArrayList<>();
        inorder(a, arr);
        System.out.println(arr);
    }
}
