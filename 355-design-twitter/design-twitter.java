class Twitter {
    Map<Integer, Set<Integer>> follow = new HashMap<>();
    LinkedList<Pair<Integer, Integer>> tweet = new LinkedList<>();

    public Twitter() {
        
    }
    
    public void postTweet(int userId, int tweetId) {
        tweet.addFirst(new Pair<>(userId, tweetId));
    }
    
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> ans = new ArrayList<>();
        for (Pair<Integer, Integer> p : tweet) {
            if (p.getKey() == userId || (follow.containsKey(userId) && follow.get(userId).contains(p.getKey()))) {
                ans.add(p.getValue());
            }
            if (ans.size() == 10) return ans;
        }
        return ans;
    }
    
    public void follow(int followerId, int followeeId) {
         follow.computeIfAbsent(followerId, z -> new HashSet<>()).add(followeeId);  
    }
    
    public void unfollow(int followerId, int followeeId) {
      if (follow.containsKey(followerId)) follow.get(followerId).remove(followeeId); 
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */