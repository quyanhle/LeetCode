// Last updated: 8/7/2025, 6:19:09 PM
class Solution {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) {
            return new ArrayList<>(Arrays.asList(1));
        }
        if (rowIndex == 1 ) {
            return new ArrayList<>(Arrays.asList(1, 1));
        }

        List<Integer> l = getRow(rowIndex - 1);
        int[] res = new int[l.size() + 1];
        res[0] = 1;
        res[res.length - 1] = 1;
        int left = 0, right = l.size()-1;
        while (left < right) {
            res[left+1] = l.get(left) + l.get(left+1);
            res[right] = l.get(right) + l.get(right-1);
            left++;
            right--;
        }
        List<Integer> resList = new ArrayList<>();
        for (int i : res) {
            resList.add(i);
        }
        return resList;
    }
}