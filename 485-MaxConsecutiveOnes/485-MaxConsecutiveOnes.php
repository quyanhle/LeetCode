// Last updated: 8/7/2025, 6:18:35 PM
class Solution {

    /**
     * @param Integer[] $nums
     * @return Integer
     */
    function findMaxConsecutiveOnes($nums) {
        $max = 0;
        $k = 0;
        for ($i = 0; $i<count($nums); $i++) {
            if ($nums[$i] == 1) {
                $max = max($i - $k + 1, $max);
            } else {
                $k = $i+1;
            }
        }
        return $max;
    }
}