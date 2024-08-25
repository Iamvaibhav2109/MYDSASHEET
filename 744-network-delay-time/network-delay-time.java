class Solution {
    HashMap<Integer, List<int[]>> map;
    HashSet<Integer> visited;
    PriorityQueue<int[]> pq;
    public int networkDelayTime(int[][] times, int n, int k) {
        map = new HashMap<>();
        pq= new PriorityQueue<>((a, b) -> (a[1] - b[1]));
        int ans =0;
        visited = new HashSet<>();
        buildMap(times);
        pq.offer(new int[] {k, 0}); //As we have to send signals form k
        
        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int node = curr[0];
            int cost = curr[1];
            
            if(visited.contains(node)){
                continue;
            }
            visited.add(node);
            ans= Math.max(ans, cost);
            
            if(!map.containsKey(node)){
                continue;
            }
            for(int[] neighbour: map.get(node)){
                pq.offer(new int[]{neighbour[0], neighbour[1] + cost});
            }
        }
        return visited.size() == n ?ans : -1;
    }
    private void buildMap(int[][] times){
        for(int[] edge: times){
            map.putIfAbsent(edge[0], new ArrayList<>());
            map.get(edge[0]).add(new int[]{edge[1], edge[2]});
        }
        
    }
}