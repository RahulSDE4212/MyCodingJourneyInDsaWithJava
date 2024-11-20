package ArraysAndArrayList.Leetcode;
import java.util.*;
public class _1598_CrawlerLogFolder {
    public static int minOperations(String[] logs) {
        /* ********** Approach 1: using Stack ***************
        * Time Complexity  : O(n)
        * Space Complexity : O(n)
        * Algorithm:
        *   Step 1 : Create an empty stack.
        *   Step 2 : traverse the array logs and check if the command is to move inside a folder
        *            push it into stack.
        *           -> if command is to come out from the folder, pop from the stack.
        *   Step 3 : return the stack size.
        * */
//        Stack<String> st = new Stack<>();
//
//        for(int i = 0; i < logs.length; i++){
//            if(!(logs[i].equals("../")) && !(logs[i].equals("./"))) st.push(logs[i]);
//            if(!(st.isEmpty()) && logs[i].equals("../")) st.pop();
//        }
//
//        return st.size();

        /* ************** Approach 2 : Using count variable ********************
        * Time Complexity  : O(n)
        * Space Complexity : O(1)
        * Algorithm :
        *   Step 1 : create a counter variable of int data type to 0.
        *   Step 2 : increment counter for "x/"
        *   Step 3 : decrement counter for "../"
        *   step 4 : leave counter as it is for "./"
        *   Step 5 : after traversing the entire log array return the counter variable.
        * */
        int count = 0;
        for(String log : logs){
            if(log.equals("../")){
                if(count != 0) count--;
            }
            else if(!(log.equals("./"))) count++;
        }
        return count;

    }
    public static void main(String[] args) {
        String[] logs = {"d1/","d2/","../","d21/","./"};

    }
}
