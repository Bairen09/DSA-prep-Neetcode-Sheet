class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1, right=0;
        for(int p:piles){
            right=Math.max(right, p);
        }
        int ans=right;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(canDo(h,piles,mid)){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
    public boolean canDo(int h,int[]piles, int speed){
        int time=0;
        for(int p:piles){
            time+=(int)Math.ceil((double)p/speed);
        }
       return time<=h;
    }
}
