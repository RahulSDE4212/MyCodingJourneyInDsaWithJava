package Queue.ClassWork;
import java.util.*;
public class PrintAllElementWithoutInBuiltFunction {
    public static void print(Queue<Integer> q, Queue<Integer> helper){
        while(!q.isEmpty()){
            int ele = q.poll();
            System.out.print(ele + " ");
            helper.add(ele);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        Queue<Integer> helper = new LinkedList<>();
        print(q, helper);

        while(!helper.isEmpty()){
            q.add(helper.poll());
        }

        System.out.println(q);

    }
}
