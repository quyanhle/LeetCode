// Last updated: 8/7/2025, 6:18:13 PM
class Solution {
    public int numberOfSteps(int num) {
        return greedy(num);
    }

    public int greedy(int num) {
        if (num == 0) {
            return 0;
        }

        if (num % 2 == 0) {
            return greedy(num /2) + 1;
        }
        
        return greedy(num - 1) + 1;
    }
}