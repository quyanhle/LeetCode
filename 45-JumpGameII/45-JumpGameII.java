class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        //
        if ( n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        int i = findSecondLastIndex(nums);

        return jump(Arrays.copyOfRange(nums, 0, i)) + 1;
    }

    private int findSecondLastIndex(int[] nums) {
        int i = 0, maxReachSoFar = 0, last = nums.length -1 ;
        while (i <= maxReachSoFar && maxReachSoFar < last) {
            maxReachSoFar = Math.max(maxReachSoFar, i + nums[i++]);
        }
        return i;
    }
}