class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length()<ransomNote.length()) return false;
        int freq[]=new int [26];
        for(char c: magazine.toCharArray()){
            int index= c-'a';
            freq[index]++;
        }
        for(char c: ransomNote.toCharArray()){
            int index= c-'a';
            if(freq[index]==0){
                return false;
            }
            else{
                freq[index]--;
            }
        }
        return true;
    }
}