class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        StringBuilder result = new StringBuilder("");
        int i;
        for (i = 0; i < Math.max(len1, len2); i++) {
            if (len1 > i) {
                result.append(word1.charAt(i));
            }
            if (len2 > i) {
                result.append(word2.charAt(i));
            }
        }
        return result.toString();

    }
}