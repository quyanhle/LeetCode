// Last updated: 8/7/2025, 6:19:01 PM
class Solution {

    /**
     * @param Integer[] $numbers
     * @param Integer $target
     * @return Integer[]
     */
    function twoSum($numbers, $target) {
        $i = 0;
        $j = count($numbers) - 1;
        while ($i < $j) {
            if ($numbers[$i] + $numbers[$j] == $target) {
                return [$i+1, $j+1];
            }
            
            elseif ($numbers[$i] + $numbers[$j] < $target) {
                $i++;
            } else {
                $j--;
            }
        }
    }
}