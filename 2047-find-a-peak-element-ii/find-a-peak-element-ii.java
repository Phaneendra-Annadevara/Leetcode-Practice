class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int l = 0;
        int h = n-1;
        while(l<=h){
            int mid = l+(h-l)/2;
            int maxR = 0;
            for(int i=0;i<m;i++){
                if(mat[i][mid]>mat[maxR][mid]){
                    maxR = i;
                }
            }
            int left = -1;
            if(mid>0){
                left = mat[maxR][mid-1];
            }
            int right = -1;
            if(mid<n-1){
                right = mat[maxR][mid+1];
            }
            if(mat[maxR][mid]>left && mat[maxR][mid]>right){
                return new int[]{maxR,mid};
            }else if(right>mat[maxR][mid]){
                l = mid+1;
            }else{
                h = mid-1;
            }
        }
        return new int[]{-1,-1};
    }
}