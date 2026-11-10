class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        for(int i=1;i<=9;i++){
            int num = i;
            for(int j=i+1;j<=9;j++){
                int n = num*10 + j;
                // if(Integer.parseInt(n)>=low && Integer.parseInt(n)<=high){
                //     ans.add(Integer.parseInt(n));
                // }
                // num = Integer.parseInt(n);
                if(n>=low && n<=high){
                    ans.add(n);
                   
                }
                 num = n;
            }
        }
        Collections.sort(ans);
        return ans;
    }
}