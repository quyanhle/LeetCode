class Solution {
    public void moveZeroes(int[] nums) {
        for (int cur=0, last=0; cur < nums.length; cur++) {
            if (nums[cur] != 0) {
                int temp = nums[cur];
                nums[cur] = nums[last];
                nums[last++] = temp;
            }
        }
    }
}