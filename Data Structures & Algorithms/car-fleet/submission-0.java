class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double>stack= new Stack<>();
        double[][]res= new double[position.length][2];
        int ans=0;
        for(int i=0;i<position.length;i++){
            res[i][0]=position[i];
            res[i][1]=(double)(target-position[i])/speed[i];
        }
        Arrays.sort(res,(a,b)->Double.compare(a[0],b[0]));

        for(int i=position.length-1;i>=0;i--){
            double time= res[i][1];
            if(!stack.isEmpty()&& time<=stack.peek()){
                continue;
            }
            stack.push(time);
        }
        return stack.size();
    }
}
