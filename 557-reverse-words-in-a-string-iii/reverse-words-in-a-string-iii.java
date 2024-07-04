class Solution {
    public String reverseWords(String s) {
        String word="";
        String res="";
        for(int i=0;i<s.length(); i++){
            if(s.charAt(i)==' '){
                res += word + " ";
                word = "";
            }
            else{
                word=s.charAt(i)+word;
            }
        }
        res += word;        
        return res;
    }
}