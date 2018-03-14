package sample.post;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sample.domain.Post;

@Service
public class PostServiceImpl implements PostService{

	@Autowired
	PostDao dao;
	
	@Override
	public List<Post> list() {
		return dao.list();
	}

	@Override
	public void add(Post post) {
		dao.add(post);
	}

	

}
