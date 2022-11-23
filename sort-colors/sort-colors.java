class Solution {
    public void sortColors(int[] nums) {
        int redCnt=0, whiteCnt=0, blueCnt =0;
        for (int i=0; i< nums.length; i++) {
            if (nums[i] == 0) {
                redCnt++;
            } else if (nums[i] == 1) {
                whiteCnt++;
            } else {
                blueCnt++;
            }
        }
        
        for(int i =0; i< nums.length; i++) {
            if (i<redCnt) {
                nums[i] = 0;
            } else if (i >= redCnt && i< (redCnt + whiteCnt)) {
                nums[i] = 1;
            } else {
                nums[i] = 2;
            }
        }
    }
}