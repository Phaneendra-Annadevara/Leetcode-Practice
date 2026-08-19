class Solution {
    static int maxValue(int[] nums){
        int max = 0;
        for(int i:nums){
        max = Math.max(max,i);
        }
        return max;
    }
    static int minValue(int[] nums){
        int min = 0;
        for(int i:nums){
        min = Math.min(min,i);
        }
        return min;
    }
    static int possible(int[] nums,int k){
        int sum = 0;
        double part = 0;
        for(int i=0;i<nums.length;i++){
            part = Math.ceil((double) nums[i]/(double) k);
            sum += part;
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
       int l = minValue(nums);
       int h = maxValue(nums);
        while(l<=h){
            int mid = l+(h-l)/2;
            int value = possible(nums,mid);
            if(value<=threshold){
                h = mid-1;
            }else{
               l = mid+1;
            }
        }return l;
    }
}