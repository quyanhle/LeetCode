class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        return binarySearch(arr, 0, arr.length - 1);
    }
    private int binarySearch(int[] arr, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = (right + left) / 2;
        if (arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]) {
            return mid;
        }

        if (arr[mid] < arr[mid+1]) {
            return binarySearch(arr, mid+1, right);
        } 
        else {
            return binarySearch(arr, left, mid-1);
        }
    }
}