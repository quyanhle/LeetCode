class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        // int tobeChanged =1;
        // for (int i = 1; i<nums.length; i++) {
        //     if (nums[i] != nums[i-1]) {
        //         nums[tobeChanged++] = nums[i];
        //     }
        // }
        // return tobeChanged;
        
        int swapIdx = 1, curr=1;
        while (curr<nums.length) {
            if (nums[curr] != nums[swapIdx-1]) {
                int temp = nums[swapIdx];
                nums[swapIdx++] = nums[curr];
                nums[curr] = temp;
                
            }
            curr++;
        }
        return swapIdx;
    }
}