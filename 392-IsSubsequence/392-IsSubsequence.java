// Last updated: 8/7/2025, 6:18:40 PM
class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) {
            return false;
        }
        if (s.length() == 0) {
            return true;
        }
        int i=0, j =0;
        while (i<t.length() && j < s.length()) {
            if (t.charAt(i) == s.charAt(j)) {
                if (j == s.length() - 1) {
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}