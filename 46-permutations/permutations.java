class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    boolean visit[];
    public List<List<Integer>> permute(int[] nums) {
        visit = new boolean[nums.length];
        solve(new ArrayList<>(),0,nums);
        return ans;
    }
    
    void solve(List<Integer>arr, int index,int[] nums){
       
        if(index==nums.length){
            ans.add(new ArrayList<>(arr));
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            if(visit[i]==false){
                arr.add(nums[i]);
                visit[i] = true;
                solve(arr,index+1,nums);
                arr.remove(arr.size()-1);
                visit[i] = false;
            }
        }
    }
}