class Solution {
    public int longestMountain(int[] arr) {
        int ans = 0;
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                int f = i-1;
                int s = i+1;
                while(f>0 && arr[f-1]<arr[f]){
                    f--;
                }
                while(s<arr.length-1 && arr[s]>arr[s+1]){
                    s++;
                }
                int cnt = s-f+1;
                ans = Math.max(ans,cnt);
            }
        }return ans;
    }
}