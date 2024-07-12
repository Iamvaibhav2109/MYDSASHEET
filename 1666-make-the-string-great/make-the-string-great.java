class Solution {
    public String makeGood(String s) {
        if(s.length()==1){
            return s;
        }
        Stack<Character> str=new Stack();
        for(int i=0;i<s.length();i++){
            if(!str.isEmpty() && Math.abs(str.peek()-s.charAt(i))==32){
                 str.pop();
            }
            else{
                str.push(s.charAt(i));
            }
        }
        StringBuilder result = new StringBuilder();
        while(!str.isEmpty()){
            result.insert(0, str.pop());
        }
        return result.toString();
    }
}