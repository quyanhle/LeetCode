// Last updated: 8/7/2025, 6:19:10 PM
import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (numRows == 1) {
            res.add(Arrays.asList(1));
            return res;
        }

        if (numRows == 2) {
            res.add(Arrays.asList(1));
            res.add(Arrays.asList(1, 1));
            return res;
        }
        List<List<Integer>> temp = generate(numRows - 1);
        temp.add(generateLast(temp));
        return temp;
    }
    
    public List<Integer> generateLast(List<List<Integer>> array) { 
        List<Integer> arrLastElement = array.get(array.size() - 1);
        int[] newLast = new int[arrLastElement.size() + 1];
        newLast[0] = 1;
        newLast[newLast.length - 1] = 1;
        int l = 0, r = arrLastElement.size() - 1;
        while (l < r) {
            newLast[l+1] = arrLastElement.get(l) + arrLastElement.get(l + 1);
            newLast[r] = arrLastElement.get(r) + arrLastElement.get(r - 1);
            l++;
            r--;
        }
        List<Integer> res = new ArrayList<>();
        for (int i : newLast) {
            res.add(i);
        }
        return res;
    }
}