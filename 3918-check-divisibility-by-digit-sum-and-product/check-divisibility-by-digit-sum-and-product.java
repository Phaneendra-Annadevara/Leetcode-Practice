class Solution {
    static int sum(int n){
        int num = n;
        int sum = 0;
        while(num>0){
            int ld = num%10;
            sum += ld;
            num /= 10;
        }
        return sum;
    }
    static int product(int n){
        int num2 = n;
        int pro = 1;
        while(num2>0){
            int ld = num2%10;
            pro *= ld;
            num2 /= 10;
        }
        return pro;
    }
    public boolean checkDivisibility(int n) {
        int val = sum(n)+product(n);
        if(n%val==0) return true;
        else return false;
    }

}