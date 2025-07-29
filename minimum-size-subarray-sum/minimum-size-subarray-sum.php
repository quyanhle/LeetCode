class Solution {

    /**
     * @param Integer $target
     * @param Integer[] $nums
     * @return Integer
     */
    function minSubArrayLen($target, $nums) {
        $result = PHP_INT_MAX;
        $k = 0;
        $currSum = 0;
        for ($i = 0; $i < count($nums); $i++) {
            $currSum += $nums[$i];
            while ($currSum >= $target) {
                $result = min($result, $i - $k + 1);
                $currSum -= $nums[$k];
                $k++;
                
            }
        }
        
        return $result == PHP_INT_MAX ? 0 : $result;
    }
}