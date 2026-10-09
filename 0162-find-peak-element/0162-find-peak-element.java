class Solution {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        if (nums.length == 2) {
            return nums[0] > nums[1] ? 0 : 1;
        }
        return binarySearch(nums, 0, nums.length-1);
    }

    public int binarySearch(int[] nums, int left, int right) {
        while (left < right) {
            int mid = (left + right) / 2;
            if (mid == 0 ) {
                return nums[mid] > nums[mid+1] ? mid : mid + 1;
            }
            if (mid == nums.length - 1) {
                return nums[mid] > nums[mid-1] ? mid : mid - 1;
            }
            if (nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]) {
                return mid;
            }

            else if (nums[mid] < nums[mid-1]) {
                return binarySearch(nums, left, mid-1);
            }
            else {
                return binarySearch(nums, mid+1, right);
            }
        }
        return left;
    }
}