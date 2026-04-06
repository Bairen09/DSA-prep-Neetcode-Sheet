class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1){
            return 0;
        }
        int i=0,count=0;
        long mul=1;
        for(int j=0;j<nums.length;j++){
            mul*=nums[j];
            while(mul>=k){               
                mul/=nums[i];
                i++;
            }
            count+=(j-i+1);
        }
        return count;
    }
}