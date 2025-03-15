/*
    ****************** Morris Traversal **************************
    * Used to do the inorder traversal in O(1) space complexity.
    * Concept Used : Linking and Unlinking.
*/

package Week_19_Binary_Search_Tree.Class_Work;
public class Morris_Traversal {
    public static void morris(TreeNode root){
        TreeNode curr = root;
        while(curr != null){
            if(curr.left != null){
                TreeNode pred = curr.left;
                while(pred.right != null && pred.right != curr) pred = pred.right;
                if(pred.right == null){
                    pred.right = curr;
                    curr = curr.left;
                }
                else{
                    System.out.print(curr.val + " ");
                    pred.right = null;
                    curr = curr.right;
                }
            }
            else{
                System.out.print(curr.val + " ");
                curr = curr.right;
            }
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(8);
        root.left = a; root.right = b;
        TreeNode c = new TreeNode(1);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(6);
        TreeNode f = new TreeNode(9);
        a.left = c;
        a.right = d;
        b.left = e;
        b.right = f;
        TreeNode g = new TreeNode(3);
        TreeNode h = new TreeNode(7);
        TreeNode i = new TreeNode(10);
        d.left = g;
        e.right = h;
        f.right = i;

        morris(root);
    }
}
