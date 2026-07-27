class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int i=0;
        int j=1;
        int n = prices.length;
        int arr[] = new int[n];
        while(i<n){
            if(j==n){
               stack.push(prices[i]);
               i++;
               j=i+1;
            }
            else if(prices[i]>=prices[j]){
                stack.push(prices[i]-prices[j]);
                i++;
                j = i+1;
            }
            else if(prices[i]<prices[j]){
                j++;
            }          
        }
          
            int k=0;
            while(!stack.isEmpty()){
                arr[k++] = stack.pop();
            }
        
        for(int l=0;l<n/2;l++){
            int temp = arr[l];
            arr[l] = arr[n-1-l];
            arr[n-1-l] = temp;
        }  
        return arr; 
    }
}
