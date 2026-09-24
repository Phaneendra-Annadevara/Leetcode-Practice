class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
           int v = nums[i];
           if(sum(v)==i){
            return i;
           }
        }return -1;
    }
    public int sum(int n){
        int s = 0;
        while(n>0){
            int ld =n%10;
            s += ld;
            n /= 10;
        }
        return s;
    }
}