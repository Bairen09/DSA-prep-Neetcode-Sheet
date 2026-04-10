class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer>stack= new Stack<>();
        int max=0;
        for(int i=0;i<=heights.length;i++){
            
            int currHeight = (i == heights.length) ? 0 : heights[i];
            
            while(!stack.isEmpty()&& currHeight<heights[stack.peek()]){
                int h= heights[stack.pop()];
                int right=i;
                int left=stack.isEmpty()?-1:stack.peek();

                int width=right-left-1;
                max=Math.max(max, h*width);
            }
            stack.push(i);
        }
        return max;
    }
}
