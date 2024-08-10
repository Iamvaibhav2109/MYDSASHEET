class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count=0;
        int prev=0;
        Arrays.sort(intervals,Comparator.comparingInt(a->a[1]));
        for(int i=1;i<intervals.length;i++){
            if(intervals[prev][1]>intervals[i][0]){
                count++;
            }else{
                prev=i;
            }
        }
        return count;
    }
}