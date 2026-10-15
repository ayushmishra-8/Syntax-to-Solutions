class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        
        if (s == null || p == null || s.length() < p.length()) {
            return result;
        }

    
        int[] pCount = new int[26];
        int[] sCount = new int[26];

       
        for (int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
            sCount[s.charAt(i) - 'a']++;
        }

       
        if (Arrays.equals(pCount, sCount)) {
            result.add(0);
        }

       
        for (int j = p.length(); j < s.length(); j++) {
            int i = j - p.length();

            sCount[s.charAt(j) - 'a']++; 
            sCount[s.charAt(i) - 'a']--; 

           
            if (Arrays.equals(pCount, sCount)) {
                result.add(i + 1); 
            }
        }

        return result;
    }
}