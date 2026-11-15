class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Integer> stack = new Stack<>();
        int last[] = new int[26];
        int seen[] = new int[26];
        for(int i=0;i<s.length();i++){
            last[s.charAt(i)-'a'] = i;
        }
        for(int i=0;i<s.length();i++){
            int ch = s.charAt(i)-'a';
            if(seen[ch]++ >0) continue;
            while(!stack.isEmpty()&& stack.peek()>ch && i<last[stack.peek()]){
                seen[stack.pop()] = 0;
            }
            stack.push(ch);
        }
        StringBuilder sb = new StringBuilder();
        for(int i: stack){
            sb.append((char)(i +'a'));
        }
        return sb.toString();
    }
}