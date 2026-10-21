class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>>map= new HashMap<>();

        for(String s: strs){
            String freq=frequencyOf(s);

            if(map.containsKey(freq)){
                //we will add that to the map
                map.get(freq).add(s);
            }
            else{
                //make a new list 
                List<String>group=new ArrayList<>();
                group.add(s);
                map.put(freq,group);
            }
        }
        return new ArrayList<>(map.values());
    }
    private String frequencyOf(String str){
        int fr[]=new int[26];
        for(char c:str.toCharArray()){
            fr[c-'a']++;
        }
        //then we do the calculation of String frequency
        StringBuilder sb= new StringBuilder();
        for(int n:fr){
            sb.append(n).append("#");
        }
        return sb.toString();
    }
}
