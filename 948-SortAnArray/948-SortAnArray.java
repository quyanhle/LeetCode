// Last updated: 8/7/2025, 6:18:22 PM
class Solution {
    public int[] sortArray(int[] nums) {
        //make input array a max-heap
        for(int i = nums.length/2 -1; i >=0; i--) {
            maxHeapify(nums, nums.length, i);
        }
        
        for (int i = nums.length - 1; i >=0; i--) {
            int temp = nums[0];
            nums[0] = nums[i];
            nums[i] = temp;
            maxHeapify(nums, i, 0);
        }
        return nums;
    }
    
    private void maxHeapify(int[] arr, int heapSize, int idx) {
        int left = idx * 2 + 1;
        int right = idx * 2 + 2;
        int largest = idx;
        
        if (left < heapSize && arr[left] > arr[largest]) {
            largest = left;
        }
        
        if (right < heapSize && arr[right] > arr[largest]) {
            largest = right;
        }
        
        if (largest != idx) {
            //swap idx by largest
            int temp = arr[idx];
            arr[idx] = arr[largest];
            arr[largest] = temp;
            maxHeapify(arr, heapSize, largest);
        }
    }
}