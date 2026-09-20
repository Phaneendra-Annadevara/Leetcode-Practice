class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int prefix[] = new int[A.length];
        for(int i=0;i<A.length;i++){
            int[] newA = new int[i+1];
            int[] newB = new int[i+1];
            for(int j=0;j<newA.length;j++){
                newA[j] = A[j];
                newB[j] = B[j];
            }
            prefix[i] = check(newA,newB);
        }
        return prefix;
    }
    public int check(int[] a, int[] b){
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0,j=0;
        int c =0;
        while(i<a.length && j<b.length){
           if(a[i]==b[j]){
            c++;
            i++;
            j++;
           }else if(a[i]<b[j]){
            i++;
           }else{
            j++;
           }
        }
        return c;
    }
}