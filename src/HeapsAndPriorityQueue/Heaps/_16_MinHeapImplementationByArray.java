package HeapsAndPriorityQueue.Heaps;
class MinHeap{
    private int[] arr;
    private int size = 0;
    MinHeap(int size){
        arr = new int[size];
        size = 0;
    }
    public void add(int num) throws Error{
        if(size == arr.length) throw new Error("Heap bhara hua hai, aur kitna bharega");
        arr[size++] = num;
        upheapify(size - 1);
    }
    public int remove() throws Error{
        if(size == 0) throw new Error("Bhikari se kya lega, heap khali hai!!!");
        int peek = arr[0];
        swap(0, size - 1);
        size--;
        downHeapify(0);
        return peek;
    }
    private void downHeapify(int parentNode){
        int leftChild = 2 * parentNode + 1;
        int rightChild = 2 * parentNode + 2;
        int mindx = parentNode;
        if(leftChild < size && arr[leftChild] < arr[mindx]) mindx = leftChild;
        if(rightChild < size && arr[rightChild] < arr[mindx]) mindx = rightChild;
        if(parentNode == mindx) return;
        swap(parentNode, mindx);
        downHeapify(mindx);
    }
    public int peek() throws Error{
        if(size == 0) throw  new Error("heap abhi khali hai mere dost");
        return arr[0];
    }
    public int size(){
        return size;
    }
    public void display(){
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    private void upheapify(int childNode){
        if(childNode == 0) return;
        int parentNode = (childNode - 1) / 2;
        if(arr[childNode] < arr[parentNode]){
            swap(childNode, parentNode);
            upheapify(parentNode);
        }
    }
    private void swap(int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
public class _16_MinHeapImplementationByArray {
    public static void main(String[] args) {
        MinHeap pq = new MinHeap(10);
        pq.add(1);
        pq.add(6);
        pq.add(0);
        pq.add(-1);
        pq.display();
        //System.out.println(pq.peek());
        pq.remove();
        pq.display();
        //System.out.println(pq.peek());
        pq.remove();
        pq.display();
    }
}
