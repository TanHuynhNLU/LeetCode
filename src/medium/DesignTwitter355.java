package medium;

import java.util.*;

public class DesignTwitter355 {
    Map<Integer, Set<Integer>> followingMap;
    Map<Integer, PriorityQueue<Tweet>> tweetMap;
    int priority;

    public DesignTwitter355() {
        tweetMap = new HashMap<>();
        followingMap = new HashMap<>();
    }

    public void postTweet(int userId, int tweetId) {
        PriorityQueue<Tweet> tweets = tweetMap.getOrDefault(userId, new PriorityQueue<>(Comparator.reverseOrder()));
        tweets.add(new Tweet(tweetId, priority++));
        tweetMap.put(userId, tweets);
    }

    public List<Integer> getNewsFeed(int userId) {
        List<Integer> res = new ArrayList<>();
        PriorityQueue<Tweet> tweets = new PriorityQueue<>(Comparator.reverseOrder());
        if (tweetMap.get(userId) != null) tweets.addAll(tweetMap.get(userId));
        if (followingMap.get(userId) != null)
            for (int followee : followingMap.get(userId)) {
                if (tweetMap.get(followee) != null) tweets.addAll(tweetMap.get(followee));
            }
        int count = 0;
        while (!tweets.isEmpty() && count < 10) {
            res.add(tweets.poll().tweetId);
            count++;
        }
        return res;
    }

    public void follow(int followerId, int followeeId) {
        Set<Integer> followees = followingMap.getOrDefault(followerId, new HashSet<>());
        followees.add(followeeId);
        followingMap.put(followerId, followees);
    }

    public void unfollow(int followerId, int followeeId) {
        Set<Integer> followees = followingMap.getOrDefault(followerId, new HashSet<>());
        followees.remove(Integer.valueOf(followeeId));
        followingMap.put(followerId, followees);
    }

    class Tweet implements Comparable<Tweet> {
        int tweetId;
        int priority;

        public Tweet(int tweetId, int priority) {
            this.tweetId = tweetId;
            this.priority = priority;
        }

        @Override
        public int compareTo(Tweet o) {
            return Integer.compare(this.priority, o.priority);
        }
    }
}
