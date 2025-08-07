// Last updated: 8/7/2025, 6:18:19 PM
class Solution {
    public int connectSticks(int[] sticks) {
        int total = 0;
        if (sticks.length <= 1) {
            return total;
        }
        
         PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> a-b);
        for (int i : sticks) {
            q.add(i);
        }
        while (q.size() > 1) {
            int i = q.poll();
            int j = q.poll();
            total += (i+j);
            q.add(i+j);
        }
        return total;
    }
}