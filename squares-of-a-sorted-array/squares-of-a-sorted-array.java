class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int left=0, right=nums.length-1;
        int cursor = nums.length-1;
        while (left <= right) {
            if (Math.abs(nums[right]) >= Math.abs(nums[left])) {
                res[cursor--] = nums[right] * nums[right];
                right--;
            } else {
                res[cursor--] = nums[left] * nums[left];
                left++;
            }
        }
        return res;
    }
}