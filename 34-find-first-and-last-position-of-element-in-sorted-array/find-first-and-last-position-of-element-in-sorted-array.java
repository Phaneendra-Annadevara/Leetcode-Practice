class Solution {
    public static int leftPart(int[] nums,int target){
        int l = 0,r = nums.length-1,ans = -1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid]==target){
                ans = mid;
                r = mid-1;
            }else if(nums[mid]<target){
                l = mid+1;
            }else{
                r = mid-1;
            }
        }return ans;
    }
    public static int rightPart(int[] nums,int target){
        int l = 0,r=nums.length-1,ans = -1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid]==target){
                ans = mid;
                l = mid+1;
            }else if(nums[mid]>target){
                r =mid-1;
            }else {
                l = mid+1;
            }
        }return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int res[] = new int[2];
        res[0] = leftPart(nums,target);
        res[1] = rightPart(nums,target);
        return res;
    }
}