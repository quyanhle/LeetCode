// Last updated: 8/7/2025, 6:18:33 PM
import java.lang.*;
import java.util.*;

class Solution {
    public String reverseWords(String s) {
        String[] split = s.split(" ");
        String[] reversed = new String[split.length];
        for (int i =0; i< reversed.length; i++) {
            reversed[i] = reverse(split[i]);
        }
        
        return String.join(" ",reversed);
    }
    
    public String reverse(String s) {
        char[] ch = s.toCharArray();
        int l=0, r=ch.length-1;
        while (l<r) {
            char temp = ch[l];
            ch[l++] = ch[r];
            ch[r--] = temp;
        }
        return String.valueOf(ch);
    }
}