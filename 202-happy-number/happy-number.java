class Solution {
    public boolean isHappy(int n) {
        long div=0;
        while(n>9){
            long num=n;
            long sum=0;
            while(num>0){
               div=num%10;
               sum+=Math.pow(div,2);  
               num/=10; 
            }
            n=(int)sum; 
          }
        return n==1 || n==7;
        }
    }