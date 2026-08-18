class Solution {
    public static int MaxPile(int piles[]){
        int max = 0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>max){
                max = piles[i];
            }
        }return max;
    }
    public static int time(int[]piles, int k){
        int time = 0;
        for(int i=0;i<piles.length;i++){
            time+= Math.ceil((double) piles[i]/(double) k);
        }
        return time;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = MaxPile(piles);
        while(low<=high){
            int mid = low+(high-low)/2;
            int eatingTime = time(piles,mid);
            if(eatingTime<=h){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }return low;
    }
}