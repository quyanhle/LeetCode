class Solution {
    public int removeElement(int[] nums, int val) {
        int l = 0, r = nums.length;
        while (l < r) {
            if (nums[l] == val) {
                int temp = nums[l];
                nums[l] = nums[r-1];
                nums[r-1] = temp;
                r--;
            } else {
                l++;
            }
        }
        return r;
    }
}