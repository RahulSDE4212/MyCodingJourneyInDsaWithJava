package BinaryTree.ClassWork;
import java.util.*;
class Pair{
    TreeNode node;
    int level;
    Pair(TreeNode node, int level){
        this.node = node;
        this.level = level;
    }
}
public class ViewOfTree {
    public static int lvlOfTree(TreeNode root) {
        if(root == null) return 0;
        return 1 + Math.max(lvlOfTree(root.left), lvlOfTree(root.right));
    }
    public static void dfs2(TreeNode root, int lvl, ArrayList<Integer> ans){
        if(root == null) return;
        ans.set(lvl, root.val);
        dfs2(root.right, lvl + 1, ans);
        dfs2(root.left, lvl + 1, ans);
    }
    public static void dfs(TreeNode root, int level, List<Integer> ans) {
        if(root == null) return;
        ans.set(level, root.val);
        dfs(root.left, level + 1, ans);
        dfs(root.right, level + 1, ans);
    }

    /*
    Approach: Depth-First Search (DFS)
    Time Complexity: O(N)
    Space Complexity: O(H)
    */
    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        int level = lvlOfTree(root);
        for(int i = 0; i < level; i++) {
            ans.add(0);
        }
        dfs(root, 0, ans);
        return ans;
    }

    /*
    Approach: Depth-First Search (DFS)
    Time Complexity: O(N)
    Space Complexity: O(H)
    */
    public static ArrayList<Integer> leftView(TreeNode root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int level = lvlOfTree(root);
        for(int i = 0; i < level; i++){
            ans.add(0);
        }

        dfs2(root, 0, ans);
        return ans;
    }

    /*
    Approach: Breadth-First Search (BFS)
    Time Complexity: O(N)
    Space Complexity: O(N)
    */
    public static void topView(TreeNode root, HashMap<Integer, TreeNode> map){
        Queue<Pair> q = new LinkedList<>();
        if(root != null) q.add(new Pair(root, 0));
        while(!q.isEmpty()){
            Pair p = q.poll();
            TreeNode node = p.node;
            if(!map.containsKey(p.level)) map.put(p.level, node);
            if(node.left != null) q.add(new Pair(node.left, p.level - 1));
            if(node.right != null) q.add(new Pair(node.right, p.level + 1));
        }
    }

    /*
    Approach: Breadth-First Search (BFS)
    Time Complexity: O(N)
    Space Complexity: O(N)
    */
    public static void bottomView(TreeNode root, HashMap<Integer, TreeNode> map){
        Queue<Pair> q = new LinkedList<>();
        if(root != null) q.add(new Pair(root, 0));
        while(!q.isEmpty()){
            Pair p = q.poll();
            TreeNode node = p.node;
            map.put(p.level, node);
            if(node.left != null) q.add(new Pair(node.left, p.level - 1));
            if(node.right != null) q.add(new Pair(node.right, p.level + 1));
        }
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
        List<Integer> rsv = rightSideView(a);
        List<Integer> lsv = leftView(a);
        HashMap<Integer, TreeNode> map = new HashMap<Integer, TreeNode>();
        topView(a, map);
        System.out.println("right side view of the tree: " + rsv);
        System.out.println("left side view of the tree: " + lsv);
        System.out.println("top view of the tree");
        for(TreeNode node : map.values()){
            System.out.print(node.val + " ");
        }
        System.out.println();
        map.clear();
        bottomView(a, map);
        System.out.println("bottom view of the tree");
        for(TreeNode node : map.values()){
            System.out.print(node.val + " ");
        }

    }
    
}
