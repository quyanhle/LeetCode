class Solution {
    public int findMin(int[] nums) {
        return nums[binarySearch(nums, 0, nums.length - 1)];
    }

    private int binarySearch(int[] nums, int left, int right) {
        while (left < right) {
            int mid = (right + left) / 2;
            if (nums[mid] > nums[right]) {
                return binarySearch(nums, mid+1, right);
            }

            return binarySearch(nums, left, mid);
        }
        return left;
    }
}