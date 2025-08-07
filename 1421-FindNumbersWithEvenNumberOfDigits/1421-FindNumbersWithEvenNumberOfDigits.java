// Last updated: 8/7/2025, 6:18:14 PM
class Solution {
    public static int countDigit(int num) {
        if (num/10 == 0) {
            return 1;
        }
        return 1 + countDigit(num/10);
    }
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            if (countDigit(nums[i]) % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}