package Stack.ClassWork;
import java.util.*;
/*
    T.C. = O(n) + O(n) + O(n) = O(n)
    S.C. = O(n)(for temporary stack) + O(n)(for final stack) = O(n)
* */
public class CopyStackInAnotherStack {
    public static void main(String[] args) {
        Stack<Integer> original = new Stack<>();
        original.push(10);
        original.push(20);
        original.push(30);
        original.push(40);
        original.push(50);
        //System.out.println("This is original " + original);

        // reverse the original stack: T.C. = O(n)
        Stack<Integer> reverse = new Stack<>();
        while(!original.isEmpty()){
            reverse.push(original.pop());
        }

        // reverse the temporary Stack which contains reversed original stack
        // T.C. = O(n)
        Stack<Integer> copy = new Stack<>();
        while(!reverse.isEmpty()){
            copy.push(reverse.pop());
        }
        // for printing the stack the T.C. = O(n)
        System.out.println("This is copy " + copy);
    }

}
