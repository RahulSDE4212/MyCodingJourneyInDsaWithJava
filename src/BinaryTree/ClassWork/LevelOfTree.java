package BinaryTree.ClassWork;

public class LevelOfTree {
    public static int level(TreeNode root){
        if(root == null) return 0;
        return 1 + (Math.max(level(root.left), level(root.right)));
    }
    public static void main(String[] args) {
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(4);
        TreeNode c = new TreeNode(10);
        TreeNode d = new TreeNode(6);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(11);
        TreeNode g = new TreeNode(15);
        a.left  = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        f.right = g;

        System.out.println(level(a));
    }
}
