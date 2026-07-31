class Solution {
    public int minimumPushes(String word) {
        int res= 0;
        int freq[] = new int[26];
        for(int i=0;i<word.length();i++){
            freq[word.charAt(i)-'a']++;
        }
        Arrays.sort(freq);
        for(int i=0;i<26;i++){
            int rep= freq[26-i-1];
            if(rep==0) break;
            int x = (i/8)+1;
            res += rep*x;
        }return res;
    }
}