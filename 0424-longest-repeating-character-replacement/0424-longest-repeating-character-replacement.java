class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int maxFreq = 0;
        int left = 0;
        int res = 0;

        for (int i = 0; i< s.length(); i++) {
            int idx = s.charAt(i) - 'A';
            freq[idx]++;
            maxFreq = Math.max(maxFreq, freq[idx]);
            while (i - left + 1 - maxFreq > k) {
                int outIdx = s.charAt(left) - 'A';
                freq[outIdx]--;
                left++;
                //maxFreq = Math.max(maxFreq, freq[outIdx]);
            }
            res = Math.max(res, i-left+1);
        }
        return res;
    }
}