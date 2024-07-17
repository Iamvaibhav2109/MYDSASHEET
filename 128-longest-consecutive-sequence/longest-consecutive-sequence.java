class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        int longestStreak = 0;
        int  count=1;
        for(int num:nums){
            if(!numSet.contains(num-1)){
                int x=num;
                count=1;
                while(numSet.contains(x+1)){
                    count++;
                    x++;
                }
            }
            longestStreak=Math.max(longestStreak,count);
        }
        return longestStreak;
    }
}
