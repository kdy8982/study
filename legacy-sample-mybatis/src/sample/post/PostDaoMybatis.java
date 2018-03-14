package sample.post;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sample.domain.Post;

@Repository
public class PostDaoMybatis implements PostDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	
	@Override
	public List<Post> list() {
		PostDao postDao = sqlSession.getMapper(PostDao.class);
		return postDao.list();
	}
	
	public void add(Post post) {
		PostDao postDao = sqlSession.getMapper(PostDao.class);
		postDao.add(post);
	}
	
}
