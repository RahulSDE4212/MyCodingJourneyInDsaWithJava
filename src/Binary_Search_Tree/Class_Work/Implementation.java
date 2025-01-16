package Binary_Search_Tree.Class_Work;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}
public class Implementation {
    public static void display(TreeNode root){
        if(root == null) return;
        System.out.print(root.val + " "); // self-tree
        display(root.left); // left subtree
        display(root.right); // right subtree
    }
    public static void main(String[] args) {
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(4);
        TreeNode c = new TreeNode(10);
        TreeNode d = new TreeNode(6);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(11);
        a.left  = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        System.out.println(a.left.right.val);
        display(a);


    }
}
