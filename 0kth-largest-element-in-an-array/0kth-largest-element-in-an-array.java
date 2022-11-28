class Solution {
    public int findKthLargest(int[] nums, int k) {
        for (int i = nums.length/2 -1; i >= 0; i--) {
            maxHeapify(nums, nums.length, i);
        }


            for(int j=nums.length-1; j >= 0; j--) {
                int temp = nums[0];
                nums[0] = nums[j];
                nums[j] = temp;
                maxHeapify(nums, j, 0);
            }

        return nums[nums.length-k];
    }
    
    private void maxHeapify(int[] arr, int heapSize, int idx) {
        int left = 2 * idx + 1;
        int right = 2 * idx + 2;
        int largest = idx;
        if (left < heapSize && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < heapSize && arr[right] > arr[largest]) {
            largest = right;
        }
        
        if (largest != idx) {
            int temp = arr[idx];
            arr[idx] = arr[largest];
            arr[largest] = temp;
            maxHeapify(arr, heapSize, largest);
        }
    }
}