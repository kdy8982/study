package sample.post;

import java.util.List;

import sample.domain.Post;

public interface PostDao {
	List<Post> list();
	void add(Post post);
}
