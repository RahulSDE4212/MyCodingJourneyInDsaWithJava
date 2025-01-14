package BinaryTree.ClassWork;
import java.util.*;
public class Breath_First_Traversal {
    public static void levelOrderTraversalLeftToRight(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        if(q != null) q.add(root);
        while(q.size() > 0){
            TreeNode curr = q.poll();
            System.out.print(curr.val + " ");
            if(curr.left != null) q.add(curr.left);
            if(curr.right != null) q.add(curr.right);
        }
        System.out.println();
    }
    public static void levelOrderTraversalRightToLeft(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        if(q != null) q.add(root);
        while(q.size() > 0){
            TreeNode curr = q.poll();
            System.out.print(curr.val + " ");
            if(curr.right != null) q.add(curr.right);
            if(curr.left != null) q.add(curr.left);
        }
        System.out.println();
    }
//    public static void nThLevelTraversalUsingPreOrderTraversal(TreeNode root, int level, int lvlTarget){
//        if(root == null) return;
//        if(level == lvlTarget) System.out.print(root.val + " ");
//        nThLevelTraversalUsingPreOrderTraversal(root.left, level + 1, lvlTarget);
//        nThLevelTraversalUsingPreOrderTraversal(root.right, level + 1, lvlTarget);
//    }
    public static void nThLevelTraversalUsingInOrderTraversal(TreeNode root, int level, int lvlTarget){
        if(root == null) return;
        nThLevelTraversalUsingInOrderTraversal(root.left, level + 1, lvlTarget);
        if(level == lvlTarget) System.out.print(root.val + " ");
        nThLevelTraversalUsingInOrderTraversal(root.right, level + 1, lvlTarget);
    }
    public static void nThLevelTraversalUsingPostOrderTraversal(TreeNode root, int level, int lvlTarget){
        if(root == null) return;
        nThLevelTraversalUsingPostOrderTraversal(root.left, level + 1, lvlTarget);
        nThLevelTraversalUsingPostOrderTraversal(root.right, level + 1, lvlTarget);
        if(level == lvlTarget) System.out.print(root.val + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        TreeNode h = new TreeNode(8);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        g.left = h;

        System.out.print("Level order left to right : ");
        levelOrderTraversalLeftToRight(a);
        System.out.print("Level order right to left : ");
        levelOrderTraversalRightToLeft(a);
//        System.out.print("Enter level to print : ");
//        int lvl = sc.nextInt();
//        System.out.print(lvl + "th level is : ");
//        nThLevelTraversalUsingPreOrderTraversal(a, 0, lvl);

        System.out.println("level-order-Traversal Using nth level : ");
        for(int i = 0; i < 4; i++){
            nThLevelTraversalUsingInOrderTraversal(a, 0, i);
            System.out.println();
        }
    }
}
