class Solution {
    public int lastStoneWeight(int[] stones) {
        int num=stones.length;
        PriorityQueue<Integer>maxHeap=new PriorityQueue<>((a,b)-> b-a);
        for(int s: stones){
            maxHeap.offer(s);
        }
        while(!maxHeap.isEmpty()){
            int first=maxHeap.poll();
            if(maxHeap.isEmpty()) return first;
            int second=maxHeap.poll();
            int balance=Math.abs(first-second);
            if(balance!=0)
             maxHeap.offer(balance);
        }
        return 0;
    }
}