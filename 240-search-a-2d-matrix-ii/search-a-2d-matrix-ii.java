class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m;i++){
            if(target<matrix[i][0] || target>matrix[i][n-1]){
                continue;
            }
            int l = 0;
            int h = n-1;
            while(l<=h){
                int mid = l+(h-l)/2;
                if(matrix[i][mid]==target){
                    return true;
                }else if(matrix[i][mid]<target){
                    l = mid+1;
                }
                else h = mid-1;
            }
        }
        return false;
    }
}