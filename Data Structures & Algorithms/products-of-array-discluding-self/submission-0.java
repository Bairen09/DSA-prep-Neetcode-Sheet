class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix[]=new int[nums.length];
        int suffix[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            prefix[i]=1;
            for(int j=0;j<i;j++){
                prefix[i]*=nums[j];
            }
            suffix[i]=1;
            for(int k=i+1;k<nums.length;k++){
                suffix[i]*=nums[k];
            }
        }
        
        int[]result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            
            result[i]=prefix[i]*suffix[i];
        }
        return result;
    }
}  
