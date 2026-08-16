class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        boolean found = false;
        int maxCount = 0;
        for(int i=0;i<s.length();i++){
             char ch1 = s.charAt(i);
            for(int j=s.length()-1;j>i;j--){
                char ch2 = s.charAt(j);
                if(ch1==ch2){
                    found = true;
                    int count = 0;
                    int k=i+1;
                    while(k<j){
                        count++;
                        k++;
                    }
                    maxCount = Math.max(count,maxCount);
                   
                }
            }
           
        }
         if(found){
            return maxCount;
         }else{
            return -1;
         }
    
    }
}