class Solution {
    public String multiply(String num1, String num2) {
        int n1=num1.length();
        int n2=num2.length();
        int []arr=new int [n1+n2];
        for(int i=n1-1;i>=0;i--){
            for(int j=n2-1;j>=0;j--){
              int mul=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
              int sum = mul+arr[i+j+1]; /// i+j+1 is for calculating position at last index
              //Storing sum in our arr
                arr[i+j+1]=sum%10;
                arr[i+j] += sum/10;
              //one iteration caluclates 123 and 456 means 3*456 in the array  
            }
        }
        StringBuilder sb=new StringBuilder();
        for (int num : arr) {
            if (!(sb.length()==0 && num==0)) {
                sb.append(num);
            }
        }
        return sb.length()==0?"0":sb.toString();
    }
}