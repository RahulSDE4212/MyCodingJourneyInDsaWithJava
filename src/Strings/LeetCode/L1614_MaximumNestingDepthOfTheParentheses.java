package Strings.LeetCode;

import java.util.Stack;

public class L1614_MaximumNestingDepthOfTheParentheses {
    public static int helper(String s, int index, int maxDepth, int ans){
        if(index==s.length()){
            return maxDepth;
        }
        char ch = s.charAt(index);
        if(ch == '('){
            maxDepth++;
            ans = Math.max(ans,maxDepth);
            return helper(s,index+1,maxDepth, ans);
        }
        else if(ch==')'){
            maxDepth--;
            return helper(s,index+1,maxDepth, ans);
        }
        return helper(s,index+1,maxDepth, ans);
    }
    public static int maxDepth(String s) {
        /* Approach-1: Using Count
        Time.Complexity: O(n)
        Space Complexity : O(n)
        * Step 1 : traverse the string.
        * Step 2 : if you find opening bracket, increase the count variable
        * Step 3 : if you find closing bracket, decrease the count variable.
        * Step 4 : after every iteration, store the max of max,count in max.
        * Step 5 : after the completion of for loop, return the max.
        * */
//        int count = 0;
//        int maxCount = 0;
//        for(int i=0;i<s.length();i++){
//            char ch = s.charAt(i);
//            if(ch=='(') {
//                count++;
//                maxCount = Math.max(count,maxCount);
//            }
//            else if(ch==')') count--;
//        }
//        return maxCount;

        /* Approach-2 : using stack
        Time Complexity : O(n)
        Space Complexity : O(n)
        * Step 1 : traverse the string s.
        * Step 2 : if you find opening bracket, push into stack st.
        * Step 3 : if you fing closing bracket , pop from the stack st.
        * Step 4 : after every push and pop store the max of max,st.size() in max.
        * Step 5 : after the competion of for loop, return the max.
        * */

//        Stack<Character> st = new Stack<>();
//        int max = Integer.MIN_VALUE;
//        for(int i=0;i<s.length();i++){
//            char ch = s.charAt(i);
//            if(ch == '(') {
//                st.push(ch);
//                max = Math.max(max,st.size());
//            }
//            else if(ch==')') st.pop();
//        }
//        return max;

        /* Approach 3 : Using Recursion
        * Time Complexity : O(n)
        * Space Complexity :O(n)
        * */
        return helper(s,0,0,0);
    }
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";

    }
}
