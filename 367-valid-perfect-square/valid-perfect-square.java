class Solution {
    public boolean isPerfectSquare(int num) {
        long l = 1;
        long n = num;
        long h = n;
        while(l<=h){
            long mid = l+(h-l)/2;
            if(mid==0){
                break;
            }
            if(mid == n/mid && n%mid == 0){
                return true;
            }else if(mid>n/mid){
                h = mid-1;
            }else {
                l = mid+1;
            }
        }return false; 
    }
}