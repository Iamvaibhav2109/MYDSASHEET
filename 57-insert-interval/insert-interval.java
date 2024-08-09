class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] expandedIntervals = new int[intervals.length + 1][2];
          for(int i=0;i<intervals.length;i++){
              expandedIntervals[i]=intervals[i];
          }
          expandedIntervals[intervals.length]=newInterval;
          return merge(expandedIntervals);
     }

     private int [][] merge(int[][]intervals){
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]>mergedIntervals=new ArrayList<>();
        mergedIntervals.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            int start=intervals[i][0];
            int end=intervals[i][1];
            int lastEnd=mergedIntervals.get(mergedIntervals.size() - 1)[1];
            if(lastEnd<start){
                mergedIntervals.add(intervals[i]);
            }
            else{
                mergedIntervals.get(mergedIntervals.size() - 1)[1] = Math.max(lastEnd, end);
            }
        }
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}