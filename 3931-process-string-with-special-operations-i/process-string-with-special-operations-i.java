class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch>='a' && ch<='z'){
                sb.append(ch);
            }
            if(ch=='#'){
                sb.append(sb);
            }
            if(ch=='%'){
                sb.reverse();
            }
            if(ch=='*'){
                if(sb.length()>0){
                    sb.deleteCharAt(sb.length()-1);
                }
            }
        }
        return sb.toString();
    }
}