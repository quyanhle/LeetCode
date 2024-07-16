class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        int i = 0;
        while (i<s.length() || i<t.length()) {
            if (i<s.length()) {
                char c = s.charAt(i);
                if (c != '#') {
                    s1.push(c);
                } else {
                    if (!s1.empty()) {
                        s1.pop();
                    }
                }
            }
            if (i<t.length()) {
                char c = t.charAt(i);
                if (c != '#') {
                    s2.push(c);
                } else {
                    if (!s2.empty()) {
                        s2.pop();
                    }
                }
            }
            i++;
        }
        return s1.equals(s2);
    }
}