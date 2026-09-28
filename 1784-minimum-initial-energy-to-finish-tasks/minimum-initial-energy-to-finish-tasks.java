class Solution {
    public int minimumEffort(int[][] tasks) {
       Arrays.sort(tasks,(a,b)->Integer.compare((a[0]-a[1]),b[0]-b[1]));
    
        int l = 1;
        int h = 100000;
        int ans = h;
        while(l<=h){
            int m = l+(h-l)/2;
            if(isPossible(tasks,m)){
                ans = m;
                h = m-1;
            }else{
                l = m+1;
            }
        }
        return ans;
    }
    public boolean isPossible(int[][] tasks,int i){
        for(int task[]:tasks){
            int actual = task[0];
            int minimum = task[1];
            if(minimum>i){
                return false;
            }
            i -= actual;
        }
        return true;
    }
}