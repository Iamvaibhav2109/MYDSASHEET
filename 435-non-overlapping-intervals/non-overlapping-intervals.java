class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count=0;
        int prev=0;
        Arrays.sort(intervals,Comparator.comparingInt(a->a[1]));
        //This line sorts the intervals based on their ending times (a[1]). 
        //The idea is that if you always choose the interval that ends the earliest,
        // you'll have the most space left for the next intervals,
        // potentially minimizing the number of overlapping intervals.
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