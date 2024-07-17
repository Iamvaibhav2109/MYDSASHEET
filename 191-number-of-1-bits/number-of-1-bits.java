class Solution {
    public int hammingWeight(int n) {
        int ones=0;
        if(n==0){
            return ones;
        }
        StringBuilder bin=new StringBuilder();
        while(n>=1){
        int div=n%2; 
        bin.append(""+div);   
         n/=2;
        }
        System.out.println(bin);
        for(int i=0;i<bin.length();i++){
            if(bin.charAt(i)=='1')
             ones++;
        }
        return ones;
    }
}