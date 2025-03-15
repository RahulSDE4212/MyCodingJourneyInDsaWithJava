package Week_17_Queue.ClassWork;
class Queue1{
    int[] queue = new int[10];
    int rear = 0;
    int front = 0;
    private int size = 0;

     void print(){
        for(int ele = front; ele < rear; ele++){
            System.out.print(queue[ele] + " ");
        }
        System.out.println();
    }
    void add(int x) throws Error{
        if(rear == queue.length) throw new Error("Queue if full !!! ");
        queue[rear] = x;
        rear++;
        size++;
    }
    int remove() throws Error{
        if(size == 0) throw new Error("Underflow Condition!!!!");
        int ele = queue[front];
        front++;
        size--;
        return ele;
    }
    int poll() throws Error{
        if(size == 0) throw new Error("Underflow Condition !!!! ");
        int ele = queue[front];
        front++;
        size--;
        return ele;
    }
    int peek() throws Error{
        if(size == 0) throw new Error("Underflow Condition !!!!  ");
        return queue[front];
    }
    int size(){
        return size;
    }
    boolean isEmpty(){
        return (size == 0);
    }
    boolean isFull(){
        return (size == queue.length);
    }
}
public class ArrayImplementationOfQueue {
    public static void main(String[] args) {
        Queue1 q = new Queue1();
        System.out.println(q.size());
        q.add(100);
        q.add(100);
        q.add(100);
        q.add(100);
        q.add(100);
        q.add(100);
        q.add(100);
        q.add(100);
        q.add(100);
        q.add(100);
        //q.remove();
        //System.out.println(q.peek());
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());



    }
}
