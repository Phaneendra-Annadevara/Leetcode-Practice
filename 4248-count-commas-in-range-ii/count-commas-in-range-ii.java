class Solution {
    public long countCommas(long n) {
         long total = 0;
         long num = n-999;
        if(num>0){
            total+= num;
            num = n-999999;
            if(num>0){
                total += num;
                num = n-999999999;
                if(num>0){
                    total+= num;
                    num = n-999999999999L; //java needs to know that they are explicitely large numbers from users so add L at end
                    if(num>0){
                        total+= num;
                        num = n-999999999999999L;
                        if(num>0){
                            total+= num;
                        }
                    }
                }
            }
        }
        return total;
    }
}