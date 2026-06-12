class Solution {
    public boolean isValid(String s) {
         if(!s.isEmpty() &&
   (s.charAt(0)==')' || s.charAt(0)==']' || s.charAt(0)=='}'))
    return false;
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='['||ch=='{')
            stack.push(ch);
            else if(!stack.isEmpty()){
             if(ch==')'&&stack.peek()=='(')
            stack.pop();
            else if(ch==']'&&stack.peek()=='[')
            stack.pop();
            else if(ch=='}'&&stack.peek()=='{')
            stack.pop();
             else return false;
            }
            else
           return false;
        }
        if(stack.isEmpty())
        return true;
        return false;
    }
}