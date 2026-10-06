class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int minSoFar = Integer.MAX_VALUE;
        int res = 0;
        for(int i = 0; i< nums.length - 2; i++) {
            int twoSum = twoSum(target, i, nums);
            minSoFar = Math.min(minSoFar, Math.abs(nums[i] + twoSum - target));
            if (Math.abs(nums[i] + twoSum - target) <= minSoFar) {
                minSoFar = Math.abs(nums[i] + twoSum - target);
                res = nums[i] + twoSum;
            }
        }
        return Math.min(Integer.MAX_VALUE, res);

    }
    private int twoSum(int target, int p, int[] nums) {
        int minSoFar = Integer.MAX_VALUE;
        int left = p+1, right = nums.length - 1;
        int sum = target - nums[p];
        int res = 0;
        while (left < right) {
            int i = nums[left] + nums[right];
            if (i == sum) {
                return i;
            } else if (i < sum) {
                if (Math.abs(i-sum) <= minSoFar) {
                    minSoFar = Math.abs(i-sum);
                    res = i;
                }
                left++;
            } else {
                if (Math.abs(i-sum) <= minSoFar) {
                    minSoFar = Math.abs(i-sum);
                    res = i;
                }
                right--;
            }
        }
        return res;
    }
}