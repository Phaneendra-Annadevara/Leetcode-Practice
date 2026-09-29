/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int peak = -1;
        int l = 0;
        int h = n-1;
        while(l<h){
            int mid = l+(h-l)/2;
            if(mountainArr.get(mid)<mountainArr.get(mid+1)){
                l = mid+1;
            }else{
                h = mid;
            }
        }
        peak = l;

        //left
         l = 0;
         h = peak;
        while(l<=h){
            int m = l+(h-l)/2;
            if(mountainArr.get(m)==target){
                return m;
            }else if(mountainArr.get(m)<target){
                l = m+1;
            }else{
                h = m-1;
            }
        }

        //right
         l = peak+1;
         h = n-1;
        while(l<=h){
            int m = l+(h-l)/2;
            if(mountainArr.get(m)==target){
                return m;
            }else if(mountainArr.get(m)>target){
                l = m+1;
            }else{
                h = m-1;
            }
        }
        return -1;
    }
}