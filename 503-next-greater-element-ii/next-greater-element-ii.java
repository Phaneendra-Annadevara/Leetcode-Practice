class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int arr[] = new int[nums.length];
      
        for(int i=0;i<nums.length;i++){
              boolean found = false;
            int nge = -1;
            int d = nums[i];
            
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]>d){
                    nge = nums[j]; 
                    found = true;
                    break;
                }
            }
            if(!found){
                for(int j=0;j<i;j++){
                    if(nums[j]>nums[i]){
                        nge = nums[j];
                        break;
                    }
                }
            }
            
            arr[i] = nge;
        }
      
        return arr;
    }
}