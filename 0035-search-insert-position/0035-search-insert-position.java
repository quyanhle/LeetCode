class Solution {
    public int searchInsert(int[] nums, int target) {
        return this.binarySearch(nums, target, 0, nums.length-1);
    }
    
    public int binarySearch(int[] arr, int target, int left, int right) {
        if (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                return binarySearch(arr, target, mid + 1, right);
            }

            return binarySearch(arr, target, left, mid - 1);
        }

        return left;
    }
}