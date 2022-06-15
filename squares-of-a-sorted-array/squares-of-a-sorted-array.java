import java.lang.Math;
class Solution {
    public int[] sortedSquares(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        int left = 0;
        int right = length - 1;
        
        while (left < right) {
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                result[length-1] = nums[right] * nums[right];
                right--;
            } else {
                result[length-1] = nums[left] * nums[left];
                left++;
            }
            
            length--;
        }
        result[length-1] = nums[left] * nums[left];
        return result;
    }
}