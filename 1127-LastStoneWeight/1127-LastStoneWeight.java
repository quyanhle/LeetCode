// Last updated: 8/7/2025, 6:18:18 PM
class Solution {
    public int lastStoneWeight(int[] stones) {
        if (stones.length == 1) {
            return stones[0];
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b-a);
        for(int i : stones) {
            queue.offer(i);
        }
        while (queue.size() > 1) {
            int x = queue.poll();
            int y = queue.poll();
            if (x != y) {
                queue.offer(x-y);
            }
        }
        return queue.isEmpty() ? 0 : queue.peek();
        
    }
}