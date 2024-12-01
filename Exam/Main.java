package Exam;

public class Main {
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