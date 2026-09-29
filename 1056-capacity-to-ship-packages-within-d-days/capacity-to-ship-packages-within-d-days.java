class Solution {
    public int minWeightPoss(int[] weights){
        int min = 1;
        for(int i=0;i<weights.length;i++){
            min = Math.max(min,weights[i]);
        }
        return min; //😄😌😌😌😌
    }
    public int maxWeight(int[] weights){
        int tot = 0;
        for(int i=0;i<weights.length;i++){
            tot += weights[i];
        }
        return tot;
    }
    public int daysReq(int[] weights, int capacity){
        int size = 0;
        int day = 1;
        for(int i=0;i<weights.length;i++){
            if(weights[i]+size<=capacity){
                size += weights[i]; 
            }else{
                day++;
                size = weights[i];
            }
        }
        return day;
    }
    public int shipWithinDays(int[] weights, int days) {
        int l = minWeightPoss(weights);
        int h = maxWeight(weights);
       while(l<=h){
            int mid = l+(h-l)/2;
            int val = daysReq(weights,mid);
            if(val<=days){
                h = mid-1;
            }else{
                l = mid+1;
            }
       }
       return l;
    }
}