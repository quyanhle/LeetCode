// Last updated: 8/7/2025, 6:18:36 PM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer, Boolean> visited = new HashMap<>();
        for (int i = 0; i< nums.length; i++) {
            visited.put(nums[i], true);
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!visited.containsKey(i)) {
                res.add(i);
            }
        }
        
        return res;
    }
}