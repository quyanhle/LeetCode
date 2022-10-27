import java.lang.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int longest = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        char[] sArr = s.toCharArray();
        
        for (int right=0; right<sArr.length;) {
            if (!map.containsKey(sArr[right])) {
                map.put(sArr[right], 0);
            }
            
            int rightVal = map.get(sArr[right]);
            map.put(sArr[right], ++rightVal); 
            
            //check if character is duplicated
            
            if (map.get(sArr[right]) > 1) {
                while (map.get(sArr[right]) > 1) {
                    int leftVal = map.get(sArr[left]);
                    map.put(sArr[left], --leftVal);
                    left++;
                }
            }
            
            longest = Math.max(longest, right-left+1);
            right++;
        }
        
        return longest;
    }
}