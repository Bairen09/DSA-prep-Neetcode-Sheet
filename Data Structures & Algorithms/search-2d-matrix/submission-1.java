class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        int inRow=-1;

        for(int i=0;i<row;i++){
            if(target>=matrix[i][0]){
                inRow=i;
            }
            else{
                break;
            }
        }
        if(inRow==-1)return false;
        
        int left=0, right=col-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(matrix[inRow][mid]==target){
                return true;
            }
            else if(matrix[inRow][mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return false;
    }
}
