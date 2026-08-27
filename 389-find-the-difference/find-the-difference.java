class Solution {
    public char findTheDifference(String s, String t) {
        int freq[] = new int[26];
        for(int i=0;i<s.length();i++){
            char ch1 = s.charAt(i);
            freq[ch1-'a']++;
        }
        for(int i=0;i<t.length();i++){
            char ch2 = t.charAt(i);
            freq[ch2-'a']--;
        }
       char extra = 0;
       for(int i=0;i<26;i++){
        if(freq[i]!=0){
            extra = (char)(i+'a');
        }
       }
       return extra;
    }
}