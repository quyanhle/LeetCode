// Last updated: 8/7/2025, 6:18:14 PM
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        
        int minDif = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            int dif = arr[i] - arr[i-1];
            
            if (dif < minDif) {
                result.clear();
                result.add(Arrays.asList(arr[i-1], arr[i]));
                minDif = dif;
            } else if (dif == minDif) {
                result.add(Arrays.asList(arr[i-1], arr[i]));
            }
        }
        return result;
    }
}