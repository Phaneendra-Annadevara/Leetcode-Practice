class Solution {
    public boolean judgeSquareSum(int c) {
        long l = 0;
        long h = (long)Math.sqrt(c);
        while(l<=h){
            long val  = l*l+h*h;
            if(val==c) return true;
            else if(val>c) h--;
            else l++;
        }
        return false;
    }
}