class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i< arr.length ; i++) {

            if (map.containsKey(arr[i])) {
                return true;
            }
            map.put(arr[i]*2, 1);
            if (arr[i] % 2 == 0) {
                map.put(arr[i]/2, 1);
            }
            
        }
        
        return false;
    }
}