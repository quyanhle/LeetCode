class Solution {
    public int totalFruit(int[] fruits) {
        int res = 0;
        int maxSoFar = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;

        for (int i=0; i< fruits.length; i++) {
            if (!map.containsKey(fruits[i])) {
                map.put(fruits[i], 1);
            } else {
                map.put(fruits[i], map.get(fruits[i]) + 1);
            }
            while (map.size() > 2) {
                if (map.get(fruits[left]) > 1) {
                    map.put(fruits[left], map.get(fruits[left]) - 1);
                } else {
                    map.remove(fruits[left]);
                }
                left++;
            }
            maxSoFar = Math.max(maxSoFar, i - left + 1);
        }
        return maxSoFar;
    }
}