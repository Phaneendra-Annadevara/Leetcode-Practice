class Solution {
    List<List<Integer>> res = new ArrayList<>();
    // boolean visit[] = new boolean[nums.length];
    public void recurse(int[] nums,List<Integer>arr, boolean[] visit){
        if(arr.size()==nums.length){
            res.add(new ArrayList<>(arr));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visit[i]) continue;
            arr.add(nums[i]);
            visit[i] = true;
            recurse(nums,arr,visit);
            arr.remove(arr.size()-1);
            visit[i] = false;
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        boolean visit[] = new boolean[nums.length];
        recurse(nums,new ArrayList<>(),visit);
        return res;
    }
}