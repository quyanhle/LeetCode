import java.util.*;

class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int slow =0, quick = 1; quick < nums.length; slow++, quick++) {
            if (nums[slow] == nums[quick]) {
                return nums[slow];
            }
        }
        
        return -1;
    }
}