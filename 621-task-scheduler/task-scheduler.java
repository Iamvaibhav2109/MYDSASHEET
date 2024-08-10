class Solution {
    public int leastInterval(char[] tasks, int n) {
        int [] taskFreq = new int[26];
        for(char c: tasks){
            taskFreq[c-'A']++;
        }
        Arrays.sort(taskFreq);
        int batch=taskFreq[25];
        int slots=--batch*n;
        for(int i=0;i<25;i++){
            slots-=Math.min(taskFreq[i],batch);
        }
        return slots>0?tasks.length+slots:tasks.length;
    }
}