// Last updated: 8/7/2025, 6:18:16 PM
class Solution {
    public void duplicateZeros(int[] arr) {
        for(int i = 0; i < arr.length -1;) {
            if (arr[i] == 0) {
                for ( int j = arr.length-1; j>i; j--) {
                    arr[j] = arr[j-1];
                }
                i++;
            }
            i++;
        }
    }
}