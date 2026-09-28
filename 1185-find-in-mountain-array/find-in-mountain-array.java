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
        int l = 0;
        int h = mountainArr.length()-1;
        int peak = -1;
        while(l<h){
            int mid = l+(h-l)/2;
            if(mountainArr.get(mid)<mountainArr.get(mid+1)){
                l= mid+1;
            }else{
                h = mid;
            }
        }
        peak = l;

        //left part
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


        //right part
        l = peak+1;
        h = mountainArr.length()-1;
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