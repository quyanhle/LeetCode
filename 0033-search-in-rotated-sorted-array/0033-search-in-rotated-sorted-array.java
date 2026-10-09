class Solution {
    public int search(int[] nums, int target) {
        int right = nums.length - 1;
        int minPos = findMinPos(nums, 0, right);
        int lSearch = binarySearch(nums, target, 0, minPos - 1);
        int rSearch = binarySearch(nums, target, minPos, right);
        return lSearch != -1 ? lSearch : rSearch;
    }

    private int findMinPos(int[] nums, int left, int right) {
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    private int binarySearch(int[] nums, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = (left+right)/2;
        if (nums[mid] == target) {
            return mid;
        }
        else if (nums[mid] > target) {
            return binarySearch(nums, target, left, mid - 1);
        } else {
            return binarySearch(nums, target, mid+1, right);
        }
    }
}