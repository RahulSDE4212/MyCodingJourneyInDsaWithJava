package Week_21_HeapsAndPriorityQueue.Heaps;

public class _19_GivenBSTIsMaxHeapOrNot {
    public static class TreeNode{
        int val;
        TreeNode right;
        TreeNode left;
        TreeNode(int val){
            this.val = val;
        }
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(10);
        TreeNode b = new TreeNode(8);
        TreeNode c = new TreeNode(11);
        TreeNode d = new TreeNode(6);
        TreeNode e = new TreeNode(4);

        a.left = b; a.right = c;
        b.left = d; b.right = e;

        System.out.println(isBSTaMaxHeap(a));

    }

    private static boolean isBSTaMaxHeap(TreeNode root) {
        Integer n = size(root);
        return isHOP(root) && isCBT(root, 0, n);
    }

    private static Integer size(TreeNode root) {
        if(root == null) return 0;
        return 1 + size(root.left) + size(root.right);
    }

    private static boolean isCBT(TreeNode root, int index, Integer size) {
        if(root == null) return true;
        if(index >= size) return false;
        return isCBT(root.left, 2 * index + 1, size) && isCBT(root.right, 2 * index + 2, size);
    }

    private static boolean isHOP(TreeNode root) {
        if(root == null) return true;
        if(root.left != null && root.val < root.left.val) return false;
        if(root.right != null && root.val < root.right.val) return false;
        return isHOP(root.left) && isHOP(root.right);
    }
}
