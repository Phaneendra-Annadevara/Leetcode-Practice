class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> res = new ArrayList<>();
        int i=0;
        int n = s.length();
        while(i<n){
            char ch1 = s.charAt(i);
            int j = s.lastIndexOf(ch1);
            int k = i;
            while(k<=j){
                char ch2 = s.charAt(k);
                int l = s.lastIndexOf(ch2);
                if(l>j){
                    j = l;
                }
                k++;
            }
            res.add(j-i+1);
            i = j+1;
        }
        return res;
    }
}