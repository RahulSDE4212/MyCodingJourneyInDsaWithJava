package Queue.ClassWork.CircularQueue;
class MyCircularQueue {
    int[] queue;
    int capacity;
    int size;
    int rear;
    int front;
    public void print(){
        if(front < rear){
            for(int i = front; i < rear; i++){
                System.out.print(queue[i] + " ");
            }
        }
        else{
            for(int i = front; i < queue.length; i++){
                System.out.print(queue[i] + " ");
            }
            for(int i = 0; i < rear; i++){
                System.out.print(queue[i] + " ");
            }
        }
        System.out.println();
    }
    public MyCircularQueue(int k) {
        queue = new int[k];
        size = 0;
        rear = 0;
        capacity = k;
        front = 0;
    }

    public boolean enQueue(int value) {
        if(size == capacity) return false;
        queue[rear] = value;
        rear = (rear+1) % capacity;
        size++;
        return true;
    }

    public boolean deQueue() {
        if(size == 0) return false;
        front = (front + 1) % capacity;
        size--;
        return true;
    }

    public int Front() {
        if(size == 0) return -1;
        return queue[front];
    }

    public int Rear() {
        if(size == 0) return -1;
        if(rear == 0) return queue[capacity - 1];
        return queue[rear-1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}
public class Implementation {
    public static void main(String[] args) {
        MyCircularQueue q = new MyCircularQueue(5);
        q.enQueue(178);
        q.enQueue(256);
        q.enQueue(765);
        q.enQueue(345);
        q.print();
    }
}
