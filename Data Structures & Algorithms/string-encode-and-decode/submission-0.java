class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb= new StringBuilder();
        for(String s:strs){
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        int i=0;
        List<String>res= new ArrayList<>();
        while(i<str.length()){
            int num=0;
            while(str.charAt(i)!='#'){
                num=num*10+(str.charAt(i)-'0');
                i++;
            }
            i++;
            res.add(str.substring(i,num+i));
            i=i+num;
        }
        return res;
    }
}
