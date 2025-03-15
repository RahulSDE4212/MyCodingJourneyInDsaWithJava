package Week_21_HeapsAndPriorityQueue.Heaps;

class MaxHeap{
    private int[] arr;
    private int size = 0;
    MaxHeap(int capacity){
        arr = new int[capacity];
        size = 0;
    }
    public void add(int num){
        arr[size++] = num;
        upheapify(size - 1);
    }
    public int peek() throws Error{
        if(size == 0) throw  new Error("heap abhi khali hai mere dost");
        return arr[0];
    }
    public int remove() throws Error{
        if(size == 0) throw new Error("heap is Empty");
        int num = arr[0];
        swap(0, size - 1);
        size--;
        downHeapify(0);
        return num;
    }
    private void upheapify(int childNode){
        if(childNode <= 0) return;
        int parentNode = (childNode - 1) / 2;
        if(arr[parentNode] > arr[childNode]) return;
        if(arr[parentNode] < arr[childNode]) swap(parentNode, childNode);
        upheapify(parentNode);
    }
    private void swap(int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public void display(){
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public int size(){
        return size;
    }
    private void downHeapify(int parentNode){
        int leftChild = 2 * parentNode + 1;
        int rightChild = 2 * parentNode + 2;
        int mindx = parentNode;
        if(leftChild < size && arr[leftChild] > arr[mindx]) mindx = leftChild;
        if(rightChild < size && arr[rightChild] > arr[mindx]) mindx = rightChild;
        if(mindx == parentNode) return;
        swap(parentNode, mindx);
        downHeapify(mindx);
    }
}
public class _17_MaxHeapImplementationByArray {
    public static void main(String[] args) {
        MaxHeap pq = new MaxHeap(10);
        pq.add(1);
        pq.add(5);
        pq.add(7);
        pq.add(2);
        //pq.display();
        //System.out.println(pq.peek() + " " + pq.size());
        pq.add(11);
        //pq.display();
        //System.out.println(pq.peek() + " " + pq.size());
        pq.display();
        System.out.println(pq.remove());
        pq.display();
        System.out.println(pq.remove());
        pq.display();
        System.out.println(pq.remove());
    }
}
