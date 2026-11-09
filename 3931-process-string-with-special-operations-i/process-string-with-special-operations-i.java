class Solution {
    public String reverse(String s){
        String res = "";
        for(int i=s.length()-1;i>=0;i--){
            char c = s.charAt(i);
            res += c;
        }
        return res;
    }
    public String processStr(String s) {
        String res = "";
        if(s.isEmpty()){
            return "";
        }
        
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(ch>= 'a' && ch<='z'){
                res += ch;
            }
            if(ch=='#'){
                res += res;
            }
            if(ch=='%'){
                res = reverse(res);
            }
            if(ch=='*'){
                if(!res.isEmpty()){
                res = res.substring(0,res.length()-1);
                }
            }
        }
        return res;
    }
}