class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[]num= new int[26];
        for(char c:s.toCharArray()){
            num[c-'a']++;
        }
        for(char c:t.toCharArray()){
            num[c-'a']--;
        }
        for(int i:num){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
