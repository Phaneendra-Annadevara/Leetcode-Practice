class Solution {
    public String firstPalindrome(String[] words) {
        String res = "";
      for(int i=0;i<words.length;i++){
        String str = words[i];
        if(isPal(str)){
            res += str;
            return res;
        } 
      }  return res;
    }
    public boolean isPal(String s){
        int i=0;
        int j = s.length()-1;
        while(i<j){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if(ch1!=ch2){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
}