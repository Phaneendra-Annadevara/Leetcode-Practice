class Solution {
    public int search(int[] nums, int target) {
         int n = nums.length;
        int l = 0;
        int h = n-1;
        return bs(nums,target,0,n-1);
    }
    static int bs(int[] nums, int x,int l,int h){
        if(l>h) return -1;
        int mid = l+(h-l)/2;
        if(nums[mid]==x) return mid;
        else if(nums[mid]>x){
            return bs(nums,x,l,mid-1);
        }else{
            return bs(nums,x,mid+1,h);
        }
    }
}