class KthLargest {

    public static int order;
    public PriorityQueue<Integer> queue;
    
    public KthLargest(int k, int[] nums) {
        this.order = k;
        this.queue = new PriorityQueue<Integer>();
        for(int i : nums) {
            this.queue.offer(i);
        }
        while (this.queue.size() > k) {
            this.queue.poll();
        }
    }
    
    public int add(int val) {
        this.queue.add(val);
        while (this.queue.size() > this.order) {
            this.queue.poll();
        }
        return this.queue.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */