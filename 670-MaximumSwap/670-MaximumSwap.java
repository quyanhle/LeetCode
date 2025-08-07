// Last updated: 8/7/2025, 6:18:29 PM
class Solution {
    public int maximumSwap(int num) {
        int max = num;

        char [] c = Integer.toString(num).toCharArray();
        int n = c.length;
        int[] maxIndex = new int[n];
        maxIndex[n-1] = n-1;

        for (int i = n-2; i>=0; i--) {
            maxIndex[i] =  (c[i] > c[maxIndex[i+1]]) ? i : maxIndex[i+1];
        }

        for (int i = 0; i< n; i++) {
            if (c[i] < c[maxIndex[i]]) {
                char temp = c[i];
                c[i] = c[maxIndex[i]];
                c[maxIndex[i]] = temp;

                return Integer.parseInt(new String(c));
            }
        }
        return max;
    }
}