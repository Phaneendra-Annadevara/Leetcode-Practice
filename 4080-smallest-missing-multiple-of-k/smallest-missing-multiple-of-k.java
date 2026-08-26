class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int res = k;
        for(int i:nums){
            if(!set.contains(i)){
                set.add(i);
            }
        }
        while(set.contains(res)){
            res+=k;
        }
       
        return res;
    }
}