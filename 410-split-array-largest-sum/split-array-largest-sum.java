class Solution {
    public int isPossible(int[] nums, int maxSum){
        int countSubparts = 1;
        int currentSum = 0;
        for(int i=0;i<nums.length;i++){
            if(currentSum+nums[i]<=maxSum){
                currentSum += nums[i];
            }else{
                countSubparts ++;
                currentSum = nums[i];
            }
        }return countSubparts;
    }
    public int lowerB(int[] nums){
        int min = 0;
        for(int i=0;i<nums.length;i++){
            min = Math.max(nums[i],min);
        }
        return min;
    }
    public int upperB(int[]nums){
        int tot = 0;
        for(int i=0;i<nums.length;i++){
            tot += nums[i];
        }
        return tot;
    }
    public int splitArray(int[] nums, int k) {
        int l = lowerB(nums);
        int h = upperB(nums);
        while(l<=h){
            int mid = l+(h-l)/2;
            int val= isPossible(nums,mid);
            if(val<=k){
                h = mid-1;
            }else{
                l = mid+1;
            }
        }
        return l;
    }
}