/*
Approach: Recursive Traversal

Time Complexity: O(n)

Space Complexity: O(h)


package Binary_Search_Tree.Class_Work;

public class CountBSTThatLieInGivenRange {
    public static void countBST(TreeNode root, int lo, int hi, int[] answer){
        if(root == null) return;
        TreeNode minNode = root;
        while(minNode.left != null) minNode = minNode.left;
        int min = minNode.val;

        TreeNode minRight = root;
        while(minRight.right != null) minRight = minRight.right;
        int max = minRight.val;
        if(min >= lo && max <= hi) answer[0]++;
        countBST(root.left, lo, hi, answer);
        countBST(root.right, lo, hi, answer);
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

        int lo = 2, hi = 8;
        int[] answer = {0};
        countBST(a, lo, hi, answer);
        System.out.println(answer[0]);
    }
}
*/

/*
Approach: Recursive Traversal with Propagated Range Check

Time Complexity: O(n)

Space Complexity: O(h)
*/

package Week_19_Binary_Search_Tree.Class_Work;

public class CountBSTThatLieInGivenRange {
    public static boolean isBSTInRange(TreeNode root, int lo, int hi) {
        if (root == null) return true;

        if (root.val < lo || root.val > hi) return false;

        return isBSTInRange(root.left, lo, hi) && isBSTInRange(root.right, lo, hi);
    }

    public static void countBST(TreeNode root, int lo, int hi, int[] answer) {
        if (root == null) return;

        if (isBSTInRange(root, lo, hi)) {
            answer[0]++;
        }

        countBST(root.left, lo, hi, answer);
        countBST(root.right, lo, hi, answer);
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

        int lo = 2, hi = 8;
        int[] answer = {0};
        countBST(a, lo, hi, answer);
        System.out.println(answer[0]);
    }
}
