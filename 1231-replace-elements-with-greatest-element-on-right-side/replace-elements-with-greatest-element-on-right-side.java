class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int res[] = new int[n];
       
        for(int i=0;i<n;i++){
             int max  = -1;
            for(int j=i+1;j<n;j++){
                max = Math.max(max,arr[j]);
            }
            if(max!= -1){
                res[i] = max;
            }
            else{
                res[i] = max;
            }
        }
        return res;
    }
}