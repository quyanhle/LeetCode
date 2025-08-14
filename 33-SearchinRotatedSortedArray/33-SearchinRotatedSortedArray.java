// Last updated: 8/13/2025, 8:30:37 PM
class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int minPos = findMin(nums, l, r);
        if (nums[r] == target) {
            return r;
        }
        if (nums[r] < target) {
            return binarySearch(nums, 0, minPos - 1, target);
        }
            return binarySearch(nums, minPos, r, target);
    }

    public int findMin(int[] nums, int l, int r) {
        while (l< r) {
            int m = (l+r) / 2;
            if (nums[m] > nums[r]) {
                l = m+1;
            } else {
                r = m;
            }
        }
        return l;
    }

    public int binarySearch(int[] nums, int l, int r, int target) {
        while (l <= r) {
            int m = (l+r) / 2;
            if (nums[m] == target) {
                return m;
            }

            if ( nums[m] > target) {
                r = m - 1;
            }
            if (nums [m] < target) {
                l = m + 1;
            }
        }
        return -1;
    }
}