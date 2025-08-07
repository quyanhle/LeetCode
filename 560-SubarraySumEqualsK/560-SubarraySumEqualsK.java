// Last updated: 8/7/2025, 6:18:32 PM
class Solution {
    //Brute force
    public int subarraySum(int[] nums, int k) {
        int res = 0, sum = 0;
        HashMap<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0,1);
        for (int i = 0; i<nums.length; i++) {
            sum += nums[i];
            if (preSum.containsKey(sum-k)) {
                res += preSum.get(sum-k);
            }
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
        }
        return res;
    }
}