class Solution {
    public String largestOddNumber(String num) {
        String result="";
        char ch=num.charAt(num.length()-1);
        if(ch=='1' || ch=='3' || ch=='5' || ch=='7'|| ch=='9'){
            return num;
        }
        else{
            for (int i=0;i<num.length()-1;i++){
                String value=num.substring(0,i+1);
                char ch1=value.charAt(value.length()-1);
                  if(ch1=='1' || ch1=='3' || ch1=='5' || ch1=='7'|| ch1=='9'){
                   result=value;
                 }
            }
        }
        return ""+result;
    }
}