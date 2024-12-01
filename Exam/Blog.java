package Exam;

import java.util.*;

public class Blog {


}

class BloggingPlatform {

    public Map<Integer, Set<Integer>> followers;
    public Map<Integer, List<Integer>> post;

    public BloggingPlatform() {
        followers = new HashMap<>();
        post = new HashMap<>();
    }

    void follow(int followerId, int followeeId) { //->o(1)
        followers.putIfAbsent(followerId, new HashSet<>());
        followers.get(followerId).add(followerId);
    }

    void unfollow(int followerId, int followeeId) { //->o(1)
        if (followers.get(followerId).contains(followeeId)) {
            followers.get(followerId).remove(followerId);
        }
    }

    void publishPost(int authorId, int postId) { //o(1)
        post.putIfAbsent(authorId, new ArrayList<>());
        post.get(authorId).add(postId);
    }

    List<Integer> getFeed(int authorId) { //o(1)
        Set<Integer> following = followers.getOrDefault(authorId, new HashSet<>());// o(1)
        following.add(authorId);

        List<Integer> feed = new ArrayList<>();// o(1)
        for (int followAuthor : following) {
            if (post.containsKey(followAuthor)) {
                feed.addAll(post.get(followAuthor));
            }
        }
        Collections.sort(feed, (a, b) -> Integer.compare(b, a));
        return feed.size() > 10 ? feed.subList(0, 10) : feed;
    }
}
/*

Design a simplified version of a blogging platform where authors can publish blog posts, follow/unfollow other authors, and view the most 10 recent blog posts from the authors they follow. Implement the BlogPlatform class with the following functionalities:

Implement the BlogPlatform class:

	BlogPlatform() Initializes your object.

	void follow(int followerId, int followeeId) The author with followerId starts following the author with followeeId.

	void unfollow(int followerId, int followeeId) The author with ID followerId started unfollowing the author with ID followeeId.

	void publishPost (int authorId, int postId) Composes a new post with ID postId by the author authorId. Each call to this function will be made with a unique postId.

	List<Integer> getFeed (int authorId) Retrieves the 10 most recent blog post IDs in the author 's feed. The feed should contain posts from authors they follow, as well as their own posts. Posts must be ordered from most recent to least recent.

* */