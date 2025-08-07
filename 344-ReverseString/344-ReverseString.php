// Last updated: 8/7/2025, 6:18:45 PM
class Solution {

    /**
     * @param String[] $s
     * @return NULL
     */
    function reverseString(&$s) {
        for ($i = 0, $j = count($s) - 1; $i < $j; $i++, $j--) {
            $temp = $s[$j];
            $s[$j] = $s[$i];
            $s[$i] = $temp;
        }
    }
}