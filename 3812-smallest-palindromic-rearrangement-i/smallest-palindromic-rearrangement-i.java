class Solution {
    public String smallestPalindrome(String s) {
       
        int freq[] = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            freq[ch-'a']++;
        }
        StringBuilder leftPart = new StringBuilder();
        for(int i=0;i<26;i++){
            for(int j=0;j<freq[i]/2;j++){
                leftPart.append((char)('a'+i));
            }
        }
        String mid = "";
        for(int i=0;i<26;i++){
            if(freq[i]%2==1){
                mid = String.valueOf((char)('a'+i));
                break;
            }
        }
        String rightPart = new StringBuilder(leftPart).reverse().toString();
        return leftPart + mid + rightPart;
    }
}