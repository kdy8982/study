package sp.dao;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import sp.vo.User;

public class MysqlUserDao implements UserDao {
	SqlSessionFactory sqlSessionFactory;
	
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	@Override
	public User selectList() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User selectOne(int no) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(User user) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int no) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(User user) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User exist(String email, String password) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
