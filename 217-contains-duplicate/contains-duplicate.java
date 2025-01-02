class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> mymap =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mymap.containsKey(nums[i])){
                return true;
            }
            mymap.put(nums[i],1);
        }
        return false;
    }
}
