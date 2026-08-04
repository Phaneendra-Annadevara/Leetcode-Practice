class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans  = new ArrayList<>();
        if(matrix == null ||matrix.length==0 || matrix[0].length==0) return ans; 
        int m = matrix.length;
        int n = matrix[0].length;
        if(m==1){
            for(int j=0;j<n;j++){
                ans.add(matrix[0][j]);
            }
            return ans;
        }
        if(n==1){
            for(int i=0;i<m;i++){
                ans.add(matrix[i][0]);
            }
            return ans;
        }
        int top = 0,bottom = m-1;
        int left = 0,right = n-1;
        while(top<=bottom && left<=right){
            for(int j=left;j<=right;j++){
                ans.add(matrix[top][j]);
            }
               top++;
            for(int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int j=right;j>=left;j--){
                    ans.add(matrix[bottom][j]);   
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans.add(matrix[i][left]);  
                }
                left++;
            }
        }
        return ans;
    }
}