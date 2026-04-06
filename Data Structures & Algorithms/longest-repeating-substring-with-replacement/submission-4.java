class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer>map=new HashMap<>();
        int i=0, max=0,maxFreq=0;
        
        for(int j=0;j<s.length();j++){
            char c= s.charAt(j);
            map.put(c,map.getOrDefault(c,0)+1);
            maxFreq=Math.max(maxFreq, map.get(c));

            if((j-i+1)-maxFreq>k){
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                i++;
            }
            max=Math.max(max, (j-i+1));
        }
        return max;
    }
}
