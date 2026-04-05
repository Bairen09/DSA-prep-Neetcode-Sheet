class Solution {
    public int minimumRecolors(String blocks, int k) {
        int i=0,ops=0,min=Integer.MAX_VALUE;
        for(int j=0;j<blocks.length();j++){

            if((j-i+1)>k){
                if(blocks.charAt(i)=='W'){
                    ops--;
                }
                i++;
            }
            if(blocks.charAt(j)=='W'){
                ops++;
            }
            if((j-i+1)==k){
                min=Math.min(ops,min);
            }
        }
        return min;
    }
}