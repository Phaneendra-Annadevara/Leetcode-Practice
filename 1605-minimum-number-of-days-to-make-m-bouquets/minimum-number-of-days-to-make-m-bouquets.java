class Solution {
    static int rangeLow(int[] bloomDay){
        
        int min = 1;
        for(int i=0;i<bloomDay.length;i++){
            min = Math.min(min,bloomDay[i]);
        }     return min; 
    }
    static int rangeHigh(int[] bloomDay){
        int max = 1;
       
        for(int i=0;i<bloomDay.length;i++){
            max = Math.max(max,bloomDay[i]);
        }   return max;   
    }
    static int adjacent(int[] bloomDay,int mid,int k){
        int count = 0;
        int bqts = 0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid){
                count++;
                if(count==k){
                    bqts++;
                    count = 0;
                }
            }else{
                count = 0;
            }
        }return bqts;
    }
    public int minDays(int[] bloomDay, int m, int k) {
       if( (long)m*k > bloomDay.length) return -1;
        int l = rangeLow(bloomDay);
        int h = rangeHigh(bloomDay);
        while(l<=h){
            int mid = l+(h-l)/2;
            int possible = adjacent(bloomDay,mid,k);
            if(possible>=m){
                h = mid-1;
            }else{
                l = mid+1;
            }
        }
        return l;
    }
}