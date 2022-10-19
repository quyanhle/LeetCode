import java.lang.Math;

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
              
        int numDigits = (int) (Math.floor(Math.log10(x))) + 1;
        int exp = (int) Math.pow(10, numDigits - 1);
        
        for (int i=0; i < numDigits/2; i++) {
            if (x/exp != x%10) {
                return false;
            }
            
            x%= exp;
            x/=10;
            
            exp/=100;
        }
        return true;
    }
}