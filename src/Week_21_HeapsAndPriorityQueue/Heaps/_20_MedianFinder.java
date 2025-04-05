package Week_21_HeapsAndPriorityQueue.Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

class _20_MedianFinder {
    PriorityQueue<Integer> leftHeap;
    PriorityQueue<Integer> rightHeap;
    public _20_MedianFinder() {
        leftHeap = new PriorityQueue<>(Collections.reverseOrder());
        rightHeap = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        if(leftHeap.isEmpty() || num < leftHeap.peek()) leftHeap.offer(num);
        else rightHeap.offer(num);

        if(leftHeap.size() - rightHeap.size() > 1) rightHeap.offer(leftHeap.remove());
        if(rightHeap.size() - leftHeap.size() > 1) leftHeap.offer(rightHeap.remove());
    }
    
    public double findMedian() {
        if(leftHeap.size() == rightHeap.size()) return (leftHeap.peek() + rightHeap.peek()) / 2.0;
        if(leftHeap.size() > rightHeap.size()) return leftHeap.peek();
        return rightHeap.peek();
    }
}