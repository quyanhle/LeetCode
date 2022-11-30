class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[k];
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        
        PriorityQueue<HashMap.Entry<Integer, Integer>> queue = new PriorityQueue<>((a,b) -> 
            b.getValue() - a.getValue()                                                                 
        );
        for (HashMap.Entry<Integer, Integer> e : map.entrySet()) {
            queue.add(e);
        }
        
        for (int i =0 ; i< k; i++) {
            res[i] = queue.poll().getKey();
        }
        return res;
    }
}