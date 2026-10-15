class Solution {
    public int romanToInt(String s) {
        int n = s.length();
        int total = 0;
        for(int i=0;i<n-1;i++){
            int curr = val(s.charAt(i));
            int next = val(s.charAt(i+1));
            if(curr<next){
                total -= curr;
            }else{
                total += curr;
            }
        }
        total += val(s.charAt(n-1));
        return total;
    }

    public int val(char ch){
        if(ch=='I') return 1;
        else if(ch=='V') return 5;
        else if(ch=='X') return 10;
        else if(ch=='L') return 50;
        else if(ch=='C') return 100;
        else if(ch=='D') return 500;
        else if(ch=='M') return 1000;
        else return 0;
    }
}