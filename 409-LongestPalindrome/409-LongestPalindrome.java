// Last updated: 8/7/2025, 6:18:40 PM
class Solution {
    public int longestPalindrome(String s) {
        int[] arr = new int[255];
        int res = 0, oddCnt = 0, left = 0, right = s.length() - 1;
        boolean isPalindrome = true;
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                isPalindrome = false;
            }
            if (left == right) {
                arr[s.charAt(left++)]++;
            } else {
                arr[s.charAt(left++)]++;
                arr[s.charAt(right--)]++;
            }         
        }
        if (isPalindrome) {
            return s.length();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                res += arr[i];
            } else {
                res += arr[i];
                oddCnt++;
            }
        }
        return oddCnt > 0 ? res - oddCnt + 1 : res;
    }
}