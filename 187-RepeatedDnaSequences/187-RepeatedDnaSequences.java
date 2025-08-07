// Last updated: 8/7/2025, 6:18:58 PM
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<>();
        if (s.length() <= 10) {
            return res;
        }
        HashMap<String, Integer> map = new HashMap<>();
        int left = 0;
        int right = left + 10 - 1;
        while (right < s.length()) {
            String subStr = s.substring(left, right + 1);
            if (map.containsKey(subStr)) {
                if (map.get(subStr) == 1) {
                    res.add(subStr);
                }
                map.put(subStr, map.get(subStr) + 1);
            } else {
                map.put(subStr, 1);
            }
            right++;
            left++;
        }
        return res;
    }
}