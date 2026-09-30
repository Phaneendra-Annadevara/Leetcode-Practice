class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int l = 0;
        int h = m*n-1;
        while(l<=h){
            int mid = l+(h-l)/2;
            int mrow = mid/n;
            int mcol = mid%n;
            int val = matrix[mrow][mcol];
            if(val==target){
                return true;
            }else if(val>target){
                h = mid-1;
            }
            else l = mid+1;
        }
    return false;
    }
}