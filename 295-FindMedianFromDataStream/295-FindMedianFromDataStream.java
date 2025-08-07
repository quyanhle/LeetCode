// Last updated: 8/7/2025, 6:18:46 PM
import java.util.Comparator;

class MedianFinder {
    PriorityQueue<Integer> minHeap;
    PriorityQueue<Integer> maxHeap;
    public MedianFinder() {

        this.minHeap = new PriorityQueue<>();
        this.maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

    }
    
    public void addNum(int num) {
        double med = this.findMedian();
        if (num >= med) {
            this.minHeap.add(num);
        } else {
            this.maxHeap.add(num);
        }
        
        int diff = Math.abs(this.minHeap.size() - this.maxHeap.size());
        if (diff > 1) {
            if (this.minHeap.size() > this.maxHeap.size()) {
                this.maxHeap.add(this.minHeap.poll());
            } else {
                this.minHeap.add(this.maxHeap.poll());
            }
        }
    }
    
    public double findMedian() {
        if (this.minHeap.isEmpty() && this.maxHeap.isEmpty()) {
            return 0;
        }
        if (this.minHeap.size() == this.maxHeap.size()) {
            return (this.minHeap.peek() + this.maxHeap.peek())/2.0;
        }
        
        return this.minHeap.size() > this.maxHeap.size() ? this.minHeap.peek() : this.maxHeap.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */