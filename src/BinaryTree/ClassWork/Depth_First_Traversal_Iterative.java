package BinaryTree.ClassWork;
import java.util.*;
import java.util.ArrayList;
import java.util.Stack;

public class Depth_First_Traversal_Iterative {
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

        // preOrder Traversal -- Iterative.
        Stack<TreeNode> st = new Stack<>();
        st.push(a);
        System.out.print("PreOrder : ");
        while(!st.isEmpty()){
            TreeNode temp = st.pop();
            System.out.print(temp.val + " ");
            if(temp.right != null) st.push(temp.right);
            if(temp.left != null) st.push(temp.left);
        }
        System.out.println();


        // In-order Traversal - Iterative.
        Stack<TreeNode> st3 = new Stack<>();
        TreeNode temp = a;
        System.out.print("In-order Traversal : ");
        while(true){
            if(temp != null){
                st.push(temp);
                temp = temp.left;
            }
            else{
                if(st.isEmpty()) break;
                TreeNode top = st.pop();
                System.out.print(top.val + " ");
                temp = top.right;
            }
        }
        System.out.println();


        // Post-Order Traversal - Iterative.
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st2 = new Stack<>();
        st.push(a);
        System.out.print("Inorder : ");
        while(!st.isEmpty()){
            TreeNode t = st.pop();
            ans.add(t.val);
            if(t.left != null) st.push(t.left);
            if(t.right != null) st.push(t.right);
        }
        Collections.reverse(ans);
        for(int i = 0; i < ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
    }
}
