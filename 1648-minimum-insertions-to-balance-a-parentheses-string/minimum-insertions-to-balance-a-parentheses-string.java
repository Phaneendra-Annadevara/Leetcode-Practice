class Solution {
    public int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();
        int insert = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                stack.push(ch);
            }
            else{
                if(i+1<s.length() && s.charAt(i+1)==')'){
                    i++;
                    if(!stack.isEmpty()){
                        stack.pop();
                    }else{
                        insert++;
                    }
                }else{
                    insert++;
                    if(!stack.isEmpty()){
                        stack.pop();
                    }else{
                        insert++;
                    }
                }
            }
        }
        insert += stack.size()*2;
        return insert;
    }
}