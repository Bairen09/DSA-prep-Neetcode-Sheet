class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //calc frequency
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        //sort them bucket sort
        List<Integer>[] buckets=new List[nums.length+1];

        for(int num:map.keySet()){
            int freq=map.get(num);
            if(buckets[freq]==null){
                buckets[freq]=new ArrayList<>();
            }
            buckets[freq].add(num);
        }
        //collect k
        int[]result=new int[k];
        int count=0;

        for(int i=buckets.length-1;i>=1&&count<k;i--){
            if(buckets[i]!=null){
                for(int num:buckets[i]){
                    result[count++]=num;

                    if(count==k){
                        return result;
                    }
                }
            }
        }
        return result;

    }

}
