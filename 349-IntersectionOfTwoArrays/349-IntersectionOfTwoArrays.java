// Last updated: 8/7/2025, 6:18:43 PM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (int i : nums1) {
            set1.add(i);
        }
        
        for (int i : nums2) {
            if (set1.contains(i)) {
                list.add(i);
                set1.remove(i);
            }
        }
        
        int[] ret = new int[list.size()];
        for (int i=0; i < list.size(); i++) {
            ret[i] = list.get(i);
        }
        return ret;
    }
}