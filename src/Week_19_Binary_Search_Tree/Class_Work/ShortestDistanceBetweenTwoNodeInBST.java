/*
Approach: Iterative Lowest Common Ancestor (LCA) and Height Calculation
Time Complexity: O(h)
Space Complexity: O(1)
*/

package Week_19_Binary_Search_Tree.Class_Work;

public class ShortestDistanceBetweenTwoNodeInBST {

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode a, TreeNode b) {
        while (root != null) {
            if (root.val < a.val && root.val < b.val) {
                root = root.right;
            } else if (root.val > a.val && root.val > b.val) {
                root = root.left;
            } else {
                return root;
            }
        }
        return null; // This case should not occur if both nodes exist in the BST.
    }

    public static int calculateHeight(TreeNode root, TreeNode target) {
        int height = 0;
        while (root != null && root != target) {
            if (target.val > root.val) {
                root = root.right;
            } else {
                root = root.left;
            }
            height++;
        }
        return root == target ? height : -1; // Return -1 if the target node is not found.
    }

    public static int minDistance(TreeNode root, TreeNode a, TreeNode b) {
        TreeNode lca = lowestCommonAncestor(root, a, b);
        if (lca == null) return -1; // If the LCA doesn't exist, return -1.

        // Calculate distances from LCA to both nodes.
        int distA = calculateHeight(lca, a);
        int distB = calculateHeight(lca, b);

        if (distA == -1 || distB == -1) return -1; // If either node is not found, return -1.

        return distA + distB;
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(5);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(8);
        a.left = b; a.right = c;
        TreeNode d = new TreeNode(1);
        TreeNode e = new TreeNode(4);
        b.left = d; b.right = e;
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(9);
        c.left = f; c.right = g;
        TreeNode h = new TreeNode(3);
        TreeNode i = new TreeNode(7);
        e.left = h;
        f.right = i;
        TreeNode j = new TreeNode(10);
        g.right = j;

        int shortestDist = minDistance(a, i, j);
        System.out.println("Shortest distance between " + i.val + " and " + j.val + " is: " + shortestDist);
    }
}
