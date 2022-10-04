import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = appearCnt(nums1);
        HashMap<Integer, Integer> map2 = appearCnt(nums2);
        HashMap<Integer, Integer> resMap = new HashMap<Integer, Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        Iterator it = map1.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Integer> pair = (Map.Entry<Integer, Integer>) it.next();
            int key = pair.getKey();
            int val = pair.getValue();
            if (map2.containsKey(key)) {
                resMap.put(key, map2.get(key) <= val? map2.get(key) : val);
            }
        }
        
        Iterator resIt = resMap.entrySet().iterator();
        while (resIt.hasNext()) {
            Map.Entry<Integer, Integer> pair = (Map.Entry<Integer, Integer>) resIt.next();
            int key = pair.getKey();
            int val = pair.getValue();
            for (int i=0; i< val; i++) {
                list.add(key);
            }
        }
        int[] resArr = new int[list.size()];
        for (int i=0; i< list.size(); i++) {
            resArr[i] = list.get(i);
        }
        return resArr;
        
    }
    
    public HashMap<Integer, Integer> appearCnt(int[] nums) {
        HashMap<Integer, Integer> res = new HashMap<Integer, Integer>();
        for (int i : nums) {
            if (res.containsKey(i)) {
                res.put(i, res.get(i) + 1);
            } else {
                res.put(i, 1);
            }
        }
        return res;
    }
}