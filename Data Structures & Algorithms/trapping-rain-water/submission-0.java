class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int prefix[]=new int[n];
        int suffix[]=new int[n];

        int b=0, c=0;
        for(int i=1;i<n;i++){
            
            b=Math.max(b,height[i-1]);
            prefix[i]=b;
        }
        for(int j=n-2;j>=0;j--){
            c=Math.max(c,height[j+1]);
            suffix[j]=c;
        }
        int total=0;
        for(int i=0;i<n;i++){
            int water=Math.min(prefix[i], suffix[i])-height[i];
            if(water>0)total+=water;
        }
        return total;
    }
}
