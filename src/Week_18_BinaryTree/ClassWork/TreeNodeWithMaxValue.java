package Week_18_BinaryTree.ClassWork;

public class TreeNodeWithMaxValue {
    public static int maximumValue(TreeNode root){
        if(root == null) return Integer.MIN_VALUE;
        int a = root.val;
        int b = maximumValue(root.left);
        int c = maximumValue(root.right);
        return Math.max(a, Math.max(b, c));
    }
    public static int minimumValue(TreeNode root){
        if(root == null) return Integer.MAX_VALUE;
        int a = root.val;
        int b = minimumValue(root.left);
        int c = minimumValue(root.right);
        return Math.min(a, Math.min(b, c));
    }
    public static int size(TreeNode root){
        if(root == null) return 0;
        return 1 + size(root.left) + size(root.right);
    }
    public static int level(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(level(root.left) , level(root.right));
    }
    public static int height(TreeNode root){
        int level = level(root);
        return level - 1;
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

        System.out.println("The maximum value in the tree : " + maximumValue(a));
        System.out.println("The minimum value in the tree : " + minimumValue(a));
        System.out.println("The size of the tree : " + size(a));
        System.out.println("The level of the tree : " + level(a));
        System.out.println("The height of the tree : " + height(a));
    }
}
