class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        solve(new ArrayList<>(),0,nums);
        return ans;
    }

    void solve(List<Integer>arr,int index,int [] nums){
        if(index==nums.length){
            ans.add(new ArrayList<>(arr));
            return;
        }
       
        arr.add(nums[index]);
        solve(arr,index+1,nums);
        arr.remove(arr.size()-1);
        while(index<nums.length-1 && nums[index]==nums[index+1]){
           
            index++;
        }
        solve(arr,index+1,nums);
    }
}