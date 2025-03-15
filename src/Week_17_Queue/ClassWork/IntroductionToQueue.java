package Week_17_Queue.ClassWork;
import java.util.*;
public class IntroductionToQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        // Queue me element ko push karne ke liye hum add() method use karte hai.
        System.out.println(q.isEmpty());
        //q.remove();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        System.out.println(q.isEmpty());

        // Queue me element ko remove karne ke liye we use 2 methods"
        // 1) poll()
        // 2) remove()

        q.remove();
        System.out.println(q);
        //q.poll();
        System.out.println(q);

        // Queue me sabse pehle kaun khada hai uske liye hum use karte hai peek()
        System.out.println(q.peek());
        System.out.println(q.size());
    }
}
