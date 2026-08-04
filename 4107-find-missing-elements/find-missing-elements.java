class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        Arrays.sort(nums);
        int max = 0;
        int min = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]-1!=nums[i]){
                 min = nums[i-1];
                 max = nums[i];
            }  
            for(int j=min+1;j<max;j++){
            min++;
            arr.add(min);
           
        } 
        }
        
        return arr;
    }
}