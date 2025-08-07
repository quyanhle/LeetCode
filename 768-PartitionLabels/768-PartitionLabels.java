// Last updated: 8/7/2025, 6:18:26 PM
class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<String, int[]> map = new HashMap<>();
        int[] beginIdx = new int[256];
        int[] endIdx = new int[256];
        PriorityQueue<Map.Entry<String, int[]>> heap = new PriorityQueue<>((a,b) -> a.getValue()[0] - b.getValue()[0]);

        for (int i = 0; i < s.length(); i++) {
            if (beginIdx[s.charAt(i)] == 0) {
                beginIdx[s.charAt(i)] = i + 1;
            }
            endIdx[s.charAt(i)] = i + 1;
        }
        for (int i = 0; i < beginIdx.length; i++) {
            if (beginIdx[i] != 0) {
                map.put(Character.toString((char) i), new int[]{beginIdx[i], endIdx[i]});
            }
        }
        for (Map.Entry<String, int[]> e : map.entrySet()) {
            heap.add(e);
        }
        LinkedList<int[]> res = new LinkedList<>();
        while (!heap.isEmpty()) {
            Map.Entry<String, int[]> entry = heap.poll();
            
            if (res.isEmpty()) {               
                res.add(entry.getValue());
            } else {
                int[] last = res.getLast();
                if (entry.getValue()[0] > last[1]) {
                    res.add(entry.getValue());
                } else {
                    if (entry.getValue()[1] > last[1]) {
                    res.getLast()[1] = entry.getValue()[1];
                    }
                }               
            }           
        }
        List<Integer> result = new LinkedList<>();
        for (int[] arr : res) {
            result.add(arr[1] - arr[0] + 1);
        }
        return result;
    }
}