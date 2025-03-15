package Week_18_BinaryTree.ClassWork;

public class heightOfTree {
    public static int level(TreeNode root){
        if(root == null) return 0;
        return 1 + (Math.max(level(root.left), level(root.right)));
    }
    public static int height(TreeNode root){
        return level(root) - 1;
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

        System.out.println(height(a));
    }
}
