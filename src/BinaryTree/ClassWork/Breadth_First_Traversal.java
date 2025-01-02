package BinaryTree.ClassWork;

public class Breadth_First_Traversal {
    public static void preOrder(TreeNode root){
        if(root == null) return;
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(TreeNode root){
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }
    public static void postOrder(TreeNode root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }
    public static void reversePreOrder(TreeNode root){
        if(root == null) return;
        System.out.print(root.val + " ");
        reversePreOrder(root.right);
        reversePreOrder(root.left);
    }
    public static void reverseInOrder(TreeNode root){
        if(root == null) return;
        reverseInOrder(root.right);
        System.out.print(root.val + " ");
        reverseInOrder(root.left);
    }
    public static void reversePostOrder(TreeNode root){
        if(root == null) return;
        reversePostOrder(root.right);
        reversePostOrder(root.left);
        System.out.print(root.val + " ");
    }
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        System.out.print("Pre-order: ");
        preOrder(a);
        System.out.println();
        System.out.print("in-order: ");
        inOrder(a);
        System.out.println();
        System.out.print("post-order: ");
        postOrder(a);
        System.out.println();
        System.out.print("Reverse- Pre-order: ");
        reversePreOrder(a);
        System.out.println();
        System.out.print("Reverse- in-order: ");
        reverseInOrder(a);
        System.out.println();
        System.out.print("Reverse- post-order: ");
        reversePostOrder(a);
    }
}
