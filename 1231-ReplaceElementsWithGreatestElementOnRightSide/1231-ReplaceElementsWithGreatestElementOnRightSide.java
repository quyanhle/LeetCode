// Last updated: 8/7/2025, 6:18:15 PM
class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        for (int i = arr.length-1; i>=0; i--) {
            if (max < arr[i]) {
                int temp = arr[i];
                arr[i] = max;
                max = temp;
            } else {
                arr[i] = max;
            }
        }
        return arr;
    }
}