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