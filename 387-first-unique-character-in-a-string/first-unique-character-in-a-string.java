class Solution {
    public int firstUniqChar(String s) {
        int idx = -1;
        int freq[] = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            freq[ch-'a']++;
        }
        for(int i=0;i<s.length();i++){
            char ch1 = s.charAt(i);
            if(freq[ch1-'a']==1){
                idx = i;
                break;
            }
        }return idx;
    }
}