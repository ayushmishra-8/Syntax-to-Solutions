
class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char key = t.charAt(i);

            if (!map.containsKey(key) || map.get(key) == 0) {
                return key;
            }

            map.put(key, map.get(key) - 1);
        }

        return ' ';
    }
}