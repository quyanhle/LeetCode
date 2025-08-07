// Last updated: 8/7/2025, 6:18:38 PM
class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int added = 0;
        int i = num1.length() - 1, j = num2.length() - 1;
        while (i >= 0 || j >= 0) {
            int x = i >= 0 ? num1.charAt(i--) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j--) - '0' : 0;
            int num = (x + y + added) % 10;
            added = (x + y + added) / 10;
            res.append(num);
        }
        if (added != 0) {
            res.append(added);
        }
        return res.reverse().toString();
    }
}