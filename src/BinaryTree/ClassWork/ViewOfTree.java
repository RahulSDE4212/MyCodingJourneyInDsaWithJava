package BinaryTree.ClassWork;
import java.util.*;
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
    /*   ******************* Right-Side View ******************
        Approach: Depth First Search (DFS)
        Time Complexity: O(N)
        Space Complexity: O(H) where H is the height of the tree
                               (due to recursion stack)
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
    /* **************** Left-Side View *******************
    * Time Complexity : O(n)
    * Space Complexity: O(n)
    * */
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
    /* ************ Top-View *****************/

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


    }
}
