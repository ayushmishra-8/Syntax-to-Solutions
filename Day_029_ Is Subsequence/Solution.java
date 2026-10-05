class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while (i < t.length() && j < t.length()) {
            char ch = t.charAt(i);
            char ch2 = s.charAt(j);
            if (ch == ch2) {
                j++;
            }

            i++;
        }
        return j == s.length();
    }
}