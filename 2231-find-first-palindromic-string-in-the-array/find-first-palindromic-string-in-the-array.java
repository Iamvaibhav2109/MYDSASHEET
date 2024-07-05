class Solution {
    public String firstPalindrome(String[] words) {
        int n=words.length;
        for(int i=0;i<n;i++){
            if(isPalindrome(words[i])){
                return words[i];
            }
        }
        return "";
    }

    public boolean isPalindrome(String str){
          int ptr=0;
          boolean flag=true;
          int ptr2=str.length()-1;
          while(ptr<=ptr2){
             if(str.charAt(ptr)!=str.charAt(ptr2)){
                flag=false;
                break;
             }
             ptr++;
             ptr2--;
          }
        return flag;  
    }
}