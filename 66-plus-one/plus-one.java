class Solution {
    public int[] plusOne(int[] digits) {
        int len=digits.length-1;
        if(digits[len]!=9){
            digits[len]++;
            return digits;
        }
        for(int i=len;i>=0;i--){
            if(digits[i]==9){
               digits[i]=0;
            }
            else{
                digits[i]++;
                if(digits[i]<=9)
                  return digits;
            }
        }
        int result []=new int [len+2];
        result[0]=1;
        for(int i=1;i<len+2;i++){
            result[i]=0;
        }
        return result;
    }
}