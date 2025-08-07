// Last updated: 8/7/2025, 6:18:44 PM
class Solution {
    public boolean increasingTriplet(int[] nums) {
        int min = Integer.MAX_VALUE, mid = Integer.MAX_VALUE;
        int minPos=0, midPos=0;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] <= min) {
                min = nums[i];
                // minPos = i;
            }
            else if (nums[i] > min && nums[i] <= mid) {
                mid = nums[i];
                // midPos = i;
            } else {
                return true;
            }
        }    
        return false;
    }
}