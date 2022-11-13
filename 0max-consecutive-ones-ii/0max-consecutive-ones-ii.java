class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int lastZero = -1;
        int maxSoFar = 0, left = 0;
        
        for (int i = 0; i< nums.length; i++) {
            if (nums[i] == 0) {
                if (lastZero >= 0) {
                    left = lastZero + 1;
                }
                lastZero = i;
            }
            maxSoFar = Math.max(i-left+1, maxSoFar);
        }
        
        return maxSoFar;
    }
}