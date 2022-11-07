class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m];
        for (int i=0; i<m; i++) {
            temp[i] = nums1[i];
        }
        
        int tempPointer=0, nums2Pointer=0;
        for (int i=0; i< nums1.length; i++) {
            if (nums2Pointer >=n || (tempPointer < m && temp[tempPointer] <= nums2[nums2Pointer])) {
                nums1[i] = temp[tempPointer++];
            } else {
                nums1[i] = nums2[nums2Pointer++];
            }       
        }
    }
}