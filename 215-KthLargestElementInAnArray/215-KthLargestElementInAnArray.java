// Last updated: 8/7/2025, 6:18:55 PM
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((x, y) -> Integer.compare(x,y));
        for(int i = 0; i < nums.length; i++) {
            heap.add(nums[i]);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        return heap.poll();
    }
}