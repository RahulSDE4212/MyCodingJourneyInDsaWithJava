package Week_18_BinaryTree.ClassWork;
import java.util.*;
public class Level_Order_Traversal_Using_Queues {
    public static class Pair{
        TreeNode node;
        int level;
        Pair(TreeNode node, int level){
            this.node = node;
            this.level = level;
        }
    }
    public static void levelOrderTraversal(TreeNode root){
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        int prevLevel = 0;
        while(!q.isEmpty()){
            Pair p = q.poll();
            int lvl = p.level;
            if(prevLevel != lvl){
                prevLevel++;
                System.out.println();
            }
            System.out.print(p.node.val + " ");
            TreeNode left = p.node.left;
            TreeNode right = p.node.right;
            int level = p.level;
            if(left != null) q.add(new Pair(left, level + 1));
            if(right != null) q.add(new Pair(right, level + 1));
        }
    }
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        TreeNode h = new TreeNode(8);
        TreeNode i = new TreeNode(9);


        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        e.left = h; f.right = i;

        levelOrderTraversal(a);



    }
}
