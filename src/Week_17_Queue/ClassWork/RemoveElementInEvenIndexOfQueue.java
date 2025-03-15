package Week_17_Queue.ClassWork;

import java.util.LinkedList;
import java.util.Queue;

public class RemoveElementInEvenIndexOfQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q);
        Queue<Integer> helper = new LinkedList<>();
        int ind = 0;
        while(!q.isEmpty()){
            if(ind % 2 != 0){
                helper.add(q.poll());
            }
            else q.poll();
            ind++;
        }

        while(!helper.isEmpty()){
            q.add(helper.poll());
        }
        System.out.println(q);
    }
}
