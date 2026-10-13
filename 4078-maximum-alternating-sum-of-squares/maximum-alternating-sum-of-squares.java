class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n  = nums.length;
        long arr[] = new long[n];
        for(int i=0;i<n;i++){
            arr[i] = (long)nums[i]*nums[i];
        }
        Arrays.sort(arr);
        int mid = n/2;
        long diff = 0;
        long add = 0;
        for(int i=0;i<mid;i++){
            diff+= arr[i];
        }
        for(int i=mid;i<n;i++){
            add+= arr[i];
        }
       return add-diff;
    }
}