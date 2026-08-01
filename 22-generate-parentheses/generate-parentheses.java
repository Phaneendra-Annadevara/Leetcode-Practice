class Solution {
     List<String> ans = new ArrayList<>();
     public List<String> generateParenthesis(int n) {
       
        solve("",0,0,n);
        return ans;
        }
    void solve(String curr, int open, int close,int n){
        if(curr.length()==n*2){
            ans.add(curr);
            return;
        }
        if(open<n){
            solve(curr + "(" ,open+1,close,n);
        }
        if(close<open){
            solve(curr+")",open,close+1,n);
        }
    }
   
}