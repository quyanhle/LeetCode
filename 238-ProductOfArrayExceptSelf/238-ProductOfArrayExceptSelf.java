// Last updated: 8/7/2025, 6:18:52 PM
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] res = new int[nums.length];
        for (int i = 0; i< left.length; i++) {
            if (i==0) {
                left[i] = 1;
                continue;
            }
            left[i] = left[i-1] * nums[i-1];
        }
        for(int i = right.length-1; i >= 0; i--) {
            if (i == right.length - 1) {
                right[i] = 1;
                continue;
            }
            right[i] = right[i+1] * nums[i+1];

        }

        for (int i = 0; i < res.length; i++) {
            res[i] = left[i] * right[i];
        }
        return res;
    }
}