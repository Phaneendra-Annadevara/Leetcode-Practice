class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        solve(0,nums,new ArrayList<>());
        return res;
    }
    public void solve(int index, int[] nums,List<Integer> arr){
        if(index==nums.length){
            res.add(new ArrayList<>(arr));
            return ;
        }
        arr.add(nums[index]);
        solve(index+1,nums,arr);
        arr.remove(arr.size()-1);
        solve(index+1,nums,arr);
    }
}