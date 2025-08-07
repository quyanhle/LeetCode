// Last updated: 8/7/2025, 6:19:20 PM
class Solution {
    public void sortColors(int[] nums) {
        int left = 0, mid = 0, right = nums.length - 1;
        
        while (mid <= right) {
            if (nums[mid] < 1) {
                int temp = nums[left];
                nums[left++] = nums[mid];
                nums[mid++] = temp;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[right];
                nums[right--] = temp;
            }
        }
    }
}