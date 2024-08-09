class LRUCache {
    Map<Integer,Integer> m;
    int c;
    public LRUCache(int capacity) {
        m=new LinkedHashMap();
        c=capacity;
    }
    
    public int get(int key) {
        if(m.containsKey(key)){
            int v=m.get(key);
            m.remove(key);
            m.put(key,v);
            return v;
        }
        else return -1;
    }
    
    public void put(int key, int value) {
        if(m.containsKey(key)){
            m.remove(key);
            m.put(key,value);
            return;
        }
        if(c>0){
            c--;
            m.put(key,value);
        }
        else{
            List<Integer> l=new ArrayList(m.keySet());
            m.remove(l.get(0));
            m.put(key,value);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */