class Solution {
    public int maxProduct(int[] nums) {
        int d1 = 0;
        int d2 = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>d1){
                d2 = d1;
                d1 = nums[i];
            }
            else if(nums[i]>d2) {
                d2 = nums[i];
            }
        }return ((d1-1)*(d2-1));
    }
}