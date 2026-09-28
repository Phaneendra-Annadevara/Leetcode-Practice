class Solution {
    public int minimumEffort(int[][] tasks) {
       Arrays.sort(tasks,(a,b)->Integer.compare((a[0]-a[1]),b[0]-b[1]));
    
        for(int i=1;i<100001;i++){
            if(isPossible(tasks,i)){
                return i;
            }
        }
        return -1;
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