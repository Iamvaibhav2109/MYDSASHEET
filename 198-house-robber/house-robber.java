class Solution {
    public int rob(int[] nums) {
        int rob=0;
        int maxrob=0;
        for(int i=0;i<nums.length;i++){
            int currob=maxrob+nums[i];
            maxrob=Math.max(maxrob,rob);
            rob=currob;
        }
        return Math.max(rob, maxrob);
    }
}