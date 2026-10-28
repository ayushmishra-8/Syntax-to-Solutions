class Solution {
    public boolean isIsomorphic(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        if (sLen != tLen)
            return false;
        HashMap<Character, Character> map = new HashMap<>();
        int i = 0;
        for (char key : s.toCharArray()) {
            char value=t.charAt(i);
            if (!map.containsKey(key)) {
                if(map.containsValue(value)){
                    return false;
                }
                map.put(key, value);
                
            }
            i++; 
        }
        String str="";
        for(char key:s.toCharArray()){
            str+=map.get(key);
        }
        if(str.equals(t)) return true;
        else return false;

    }
}