class Solution {
    static int minCap(int [] arr){
        int low = 1;
        for(int i=0;i<arr.length;i++){
            low = Math.max(low,arr[i]);
        }
        return low;
    }
    static int maxCap(int [] arr){
        int tot = 0;
        for(int i=0;i<arr.length;i++){
            tot += arr[i];
        }
        return tot;
    }
    static int daysReq(int [] arr, int cap){
        int size = 0;
        int day = 1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]+size<=cap){
                size += arr[i];
            }else{
                day++;
                size = arr[i];
            }
        }return day;
    }
    public int shipWithinDays(int[] weights, int days) {
        int l = minCap(weights);
        int h = maxCap(weights);
        while(l<=h){
            int mid = l+(h-l)/2;
            int val = daysReq(weights,mid);
            if(val<=days){
                h = mid-1;
            }else{
                l = mid+1;
            }
        }   return l;
    }
}