// Last updated: 8/7/2025, 6:18:31 PM
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        
        for (int l=0, h=s1.length(); h<=s2.length(); l++, h++) {
            if (isPermutation(s1, s2.substring(l, h))) {
                return true;
            }
        }
        
        return false;
    }
    
    public boolean isPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        
        int[] map1 = new int[128];
        int[] map2 = new int[128];
        
        for (int i=0, j=0; i< s1.length(); i++, j++) {
            map1[s1.charAt(i)]++;
            map2[s2.charAt(j)]++;
        }
        
        for (int i=0; i<map1.length; i++) {
            if (map1[i] != map2[i]) {
                return false;
            }
        }
        
        return true;
    }
}