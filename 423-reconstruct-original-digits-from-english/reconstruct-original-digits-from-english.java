class Solution {
    public String originalDigits(String s) {
       int count[] = new int[10];
       for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='z') count[0]++;
            if(ch=='o') count[1]++; //1,2,4,0
            if(ch=='w') count[2]++;
            if(ch=='r') count[3]++; //3,4,0
            if(ch=='u') count[4]++; 
            if(ch=='f') count[5]++; //4,5
            if(ch=='x') count[6]++;
            if(ch=='s')count[7]++; //6,7
            if(ch=='g')count[8]++;
            if(ch=='i' )count[9]++; //5,6,8,9

       } 
       count[1] = count[1]-count[2]-count[4]-count[0];
       count[3]  = count[3]-count[4]-count[0];
       count[5] = count[5]-count[4];
       count[7] = count[7]-count[6];
       count[9] = count[9]-count[8]-count[6]-count[5];
       StringBuilder res= new StringBuilder();
       for(int i=0;i<=9;i++){
        for(int j=0;j<count[i];j++){
            res.append(i);
        }
       }
       return res.toString();
    }
}