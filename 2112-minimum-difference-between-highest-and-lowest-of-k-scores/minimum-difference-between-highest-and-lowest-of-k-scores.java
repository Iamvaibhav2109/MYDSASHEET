class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int minDiff=Integer.MAX_VALUE;
        if(k==1){
           return 0;
        }
        for (int i=0; i<=nums.length-k;i++) {
            int diff=nums[i+k-1]-nums[i];
            minDiff = Math.min(minDiff, diff);
        }
          return minDiff;
    }
}