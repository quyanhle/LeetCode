class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int i = 0, j = 0, tank = 0;
        while (i < n) {
            if (tank + gas[j%n] - cost[j%n] >= 0) {
                tank = tank + gas[j%n] - cost[j%n];
                if (j - i == n) {
                    return i;
                }

                j++;
            } else {
                if (i == j) {
                    i++;
                    j++;
                    continue;
                } 
                tank = tank - gas[i] + cost[i];
                i++;        
            }

        }
        return -1;
    }
}