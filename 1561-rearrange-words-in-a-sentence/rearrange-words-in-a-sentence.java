class Solution {
    public String arrangeWords(String text) {
        text = text.toLowerCase();
        String words [] = text.split(" ");
        for(int i=0;i<words.length-1;i++){
            for(int j=0;j<words.length-i-1;j++){
                if(words[j].length() > words[j+1].length()){
                    String temp = words[j];
                    words[j] = words[j+1];
                    words[j+1] = temp;
                }else{
                    continue;
                }
            }
        }
        words[0] = words[0].substring(0,1).toUpperCase() + words[0].substring(1); 
        String result = String.join(" ",words);
        return result;
    }
}


