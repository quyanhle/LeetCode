// Last updated: 8/7/2025, 4:54:30 PM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //merge 2 sorted findMedianSortedArrays

        int i = 0, j=0, k=0;
        int[] sorted = new int[nums1.length + nums2.length];
        while (i < nums1.length || j < nums2.length) {
            if (i < nums1.length && j < nums2.length) {
                if (nums1[i] <= nums2[j]) {
                    sorted[k++] = nums1[i++];
                } else {
                    sorted[k++] = nums2[j++];
                }
            } else if (i == nums1.length) {
                sorted[k++] = nums2[j++];
            } else if (j == nums2.length) {
                sorted[k++] = nums1[i++];
            }
        }
        if (sorted.length % 2 == 1) {
            return (double) sorted[(sorted.length)/2];
        }

        return (double) ( sorted[(sorted.length)/2 - 1] + sorted[(sorted.length)/2])/ 2;
    }
}