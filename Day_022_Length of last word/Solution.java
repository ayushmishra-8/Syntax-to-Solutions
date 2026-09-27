class Solution {
    public int lengthOfLastWord(String s) {
        int right = s.length() - 1;
        int len = 0;
        while (s.charAt(right) == ' ' && right >= 0) {
            right--;
        }
        while (right >= 0 && s.charAt(right) != ' ') {
            len++;
            right--;
        }
        return len;
    }
}