package Stack.ClassWork;
import java.util.*;
public class UnderflowAndOverflow {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.pop()); // underflow
    }
}
