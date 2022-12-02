class Solution {
    public int connectSticks(int[] sticks) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int cost = 0;
        
        for (int i : sticks) {
            heap.offer(i);
        }
        
        while (heap.size() > 1) {
            int first = heap.poll();
            int second = heap.poll();
            heap.offer(first+second);
            cost += (first + second);  
        }
        
        return cost;
    }
}