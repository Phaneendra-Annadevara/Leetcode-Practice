class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int [] arr = new int[n];
        // arr[0] = nums[0];
        for(int i=0;i<n;i++){
           int max = Max(nums,0,i);
           int min = Min(nums,i,n-1);
            arr[i] = max-min;
        }
        for(int i=0;i<n;i++){
            if(arr[i]<=k){
                return i;
            }
        }return -1;
    }
    public int Max(int[] nums,int st,int end){
        int max = 0;
        for(int i=st;i<=end;i++){
            max = Math.max(nums[i],max);
        }return max;
    }
    public int Min(int[] nums, int st, int end){
        int min = nums[st];
        for(int i=st;i<=end;i++){
            min = Math.min(nums[i],min);
        }
        return min;
    }
}