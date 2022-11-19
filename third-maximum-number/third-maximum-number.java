class Solution {
    public int thirdMax(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        long[] res = new long[] {Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > res[0]) {
                for (int j = 2; j> 0; j--) {
                    res[j] = res[j-1];
                }
                res[0] = nums[i];
            }
            
            if (nums[i] < res[0] && nums[i] > res[1]) {
                res[2] = res[1];
                res[1] = nums[i];
            }
            
            if (nums[i] < res[1] && nums[i] > res[2]) {
                res[2] = nums[i];
            }
            
        }
        return res[2] >= Integer.MIN_VALUE ? (int) res[2] : (int) res[0];
    }
}