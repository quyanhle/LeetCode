class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int swapIdx = 0;
        for (int i =0; i< nums.length; i++) {
            if (nums[i] %2 == 0) {
                int temp = nums[swapIdx];
                nums[swapIdx++] = nums[i];
                nums[i] = temp;
            }
        }
        return nums;
    }
}