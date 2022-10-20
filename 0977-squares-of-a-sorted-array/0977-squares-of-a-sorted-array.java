class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int l=0, r=nums.length-1;
        int idx = r;
        while (l<= r) {
            if (Math.abs(nums[l]) >= Math.abs(nums[r])) {
                result[idx--] = nums[l] * nums[l];
                l++;
            } else {
                result[idx--] = nums[r] * nums[r];
                r--;
            }
        }
        return result;
    }
}