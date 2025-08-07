// Last updated: 8/7/2025, 6:22:44 PM
class Solution {
    public String longestPalindrome(String s) {
        if (isPalindrome(s)) {
            return s;
        }
        String res = "";
        for (int i =0; i< s.length(); i++) {
            for (int j = i; j< s.length(); j++) {
                String k = s.substring(i,j+1);
                if (isPalindrome(k) && k.length() > res.length()) {
                    res = k;
                }
            }
        }
        return res;
    }

    private boolean isPalindrome(String s) {
        int i =0, j= s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
}