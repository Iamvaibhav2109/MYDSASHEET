class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int len=position.length;
        double [] time=new double[target];
        for(int i=0;i<len;i++){
            time[position[i]]=(double)(target-position[i])/speed[i];
        }
        int result=0;
        double prev=0.0;
        for(int i=target-1;i>=0;i--){
            double curr=time[i];
            if(curr>prev){
                prev=curr;
                result++;
            }
        }
        return result;
    }
}