// Last updated: 8/7/2025, 6:18:21 PM
class Solution {
    public boolean validMountainArray(int[] arr) {
        int idx = 0;
        while (idx < arr.length-1 && arr[idx] < arr[idx+1]) {
            idx++;
        }
        
        if (idx == 0 || idx == arr.length-1) {
            return false;
        }
        
        while (idx < arr.length-1 && arr[idx] > arr[idx+1]) {
            idx++;
        }
        
        if (idx != arr.length-1) {
            return false;
        }
        return true;
    }
}