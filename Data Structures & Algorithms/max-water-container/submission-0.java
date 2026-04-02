class Solution {
    public int maxArea(int[] heights) {
        int i=0, j=heights.length-1;
        int total=0;
        while(i<j){
            total=Math.max(total, (j-i)*Math.min(heights[i],heights[j]));
            if(heights[i]<heights[j]){
                i++;
            }else{
                j--;
            }
        }
        return total;
    }
}
