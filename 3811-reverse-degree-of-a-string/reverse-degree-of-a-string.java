class Solution {
    public int reverseDegree(String s) {
        int Maxsum = 0;
       for(int i=0;i<s.length();i++){
        int idx1 = i+1;
        int idx2 = Math.abs((s.charAt(i)-'a')-26);
        int sum = idx1*idx2;
        Maxsum+= sum;
       } 
       return Maxsum;
    }
}