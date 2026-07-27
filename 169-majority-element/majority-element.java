class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int Maxcountno = 0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                Maxcountno = nums[i];
            }
            if(nums[i]==Maxcountno){
                count++;
            }
            else{
                count--;
            }
        }
        count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==Maxcountno){
                count++;
            }
        }
        if(count>nums.length/2) 
        return Maxcountno;
        return -1;
    }
}