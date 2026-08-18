class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> res = new ArrayList<>();
        int freq[] = new int[26];
        for(int i=0;i<s.length();i++){
            char ch1 = s.charAt(i);
            freq[ch1-'a'] = i;
        }
        int i=0;
        int j = 0;
        for(int k=0;k<s.length();k++){
            char ch2 = s.charAt(k);
            j = Math.max(j,freq[ch2-'a']);
            if(j==k){
                res.add(j-i+1);
                i = j+1;
            }
        }
    return res;
    }
}