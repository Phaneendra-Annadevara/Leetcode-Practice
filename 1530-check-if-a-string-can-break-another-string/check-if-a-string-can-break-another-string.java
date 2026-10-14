class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        boolean first = true;
        boolean second = true;
        for(int i=0;i<str1.length;i++){
            if(str1[i]<str2[i]){
                first = false; 
            }
            if(str2[i]<str1[i]){
                second = false;
            }
        }
        return first||second;
    }
}