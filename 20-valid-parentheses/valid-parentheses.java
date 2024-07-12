class Solution {
    public boolean isValid(String s) {
        Stack<Character>stack=new Stack();
        int num=s.length();
        if(num<2){
            return false;
        }
        for(int i=0;i<num;i++){
            if(!stack.isEmpty() && ((stack.peek()=='(' && s.charAt(i)==')') ||
            (stack.peek()=='{' && s.charAt(i)=='}') || 
            (stack.peek()=='[' && s.charAt(i)==']')
            )){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }       
        }
        return stack.isEmpty();
        
    }
}