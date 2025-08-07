// Last updated: 8/7/2025, 6:18:46 PM
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        String[] arr = new String[255];
        HashMap<String, Character> map = new HashMap<>();
        if (pattern.length() != words.length) {
            return false;
        }
        for (int i = 0; i < words.length; i++) {
            if (arr[pattern.charAt(i)] == null && !map.containsKey(words[i])) {
                arr[pattern.charAt(i)] = words[i];
                map.put(words[i], pattern.charAt(i));
            } else {
                if (arr[pattern.charAt(i)] != null && !map.containsKey(words[i])) {
                    return false;
                }
                else if (arr[pattern.charAt(i)] == null && map.containsKey(words[i])) {
                    return false;
                } else {
                    if (!arr[pattern.charAt(i)].equals(words[i]) || map.get(words[i]) != pattern.charAt(i)) {
                        return false;
                    }
                }
                
            }

        }
        return true;
    }
}