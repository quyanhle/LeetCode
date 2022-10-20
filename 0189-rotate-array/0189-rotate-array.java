class Solution {
    public void rotate(int[] nums, int k) {
        int[] res = new int[nums.length];
        
        for (int i=0; i<nums.length; i++) {
            int idx = (i+k)%nums.length;
            res[idx] = nums[i];
        }
        for (int i=0; i<res.length; i++) {
            nums[i] = res[i];
        }
    }
}