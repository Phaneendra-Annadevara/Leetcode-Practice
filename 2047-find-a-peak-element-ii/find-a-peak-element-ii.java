class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int arr[] = new int[2];
        int max = mat[0][0];
        for(int i=0;i<m;i++){
            // int max = mat[0][0];
            for(int j=0;j<n;j++){
                if(mat[i][j]>max){
                    max = mat[i][j];
                    arr[0]=i;
                    arr[1]=j;
                }
            }
            
        }
        return arr;
    }
}