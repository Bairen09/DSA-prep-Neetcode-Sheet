class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map=new HashMap<>();
        for(String s:strs){
            String fr=frequency(s);
            if(map.containsKey(fr)){
                map.get(fr).add(s);
            }
            else{
                List<String>group=new ArrayList<>();
                group.add(s);
                map.put(fr,group);
            }
        }
        return new ArrayList<>(map.values());
    }
    
    private String frequency(String s){
        int[]freq=new int[26];

        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        for(int i:freq){
            sb.append(i).append("#");
        }
        return sb.toString();
    }
}
