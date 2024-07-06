class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result=new StringBuilder();
        while(columnNumber>0){
         columnNumber--;
         int rem=columnNumber%26;
         columnNumber=columnNumber/26;
         System.out.println(columnNumber);
         result.append((char)('A'+rem));
        }
      return result.reverse().toString();
    }
}