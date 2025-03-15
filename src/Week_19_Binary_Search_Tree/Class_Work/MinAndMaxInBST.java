package Week_19_Binary_Search_Tree.Class_Work;

public class MinAndMaxInBST {
    public static int maxInBst(TreeNode root){
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.val, maxInBst(root.right));
    }
    public static int minInBST(TreeNode root){
        if(root == null) return Integer.MAX_VALUE;
        return Math.min(root.val, minInBST(root.left));
    }
    public static void main(String[] args) {
        TreeNode a = new TreeNode(10);
        TreeNode b = new TreeNode(5);
        TreeNode c = new TreeNode(15);
        a.left = b; a.right = c;
        TreeNode d = new TreeNode(2);
        TreeNode e = new TreeNode(8);
        TreeNode f = new TreeNode(12);
        TreeNode g = new TreeNode(19);
        TreeNode h = new TreeNode(13);
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        f.right = h;

        int max = maxInBst(a);
        System.out.println("max in Bst : " + max);

        int min = minInBST(a);
        System.out.println("min in BST : " + min);

    }
}
