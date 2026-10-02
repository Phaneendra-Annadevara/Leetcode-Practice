class Solution {
    public List<String> generateParenthesis(int n) {
        solve("",0,0,n);
        return ans;
    }
    List<String> ans = new ArrayList<>();
    void solve(String curr, int open, int close, int n){
        if(curr.length()==2*n){
            ans.add(curr);
            return;
        }
        if(open<n){
            solve(curr+"(",open+1,close,n);
        }
        if(open>close){
            solve(curr+")",open,close+1,n);
        }
    }
}