package sp.dao;

import sp.vo.User;

public interface UserDao {
	User selectList() throws Exception;
	User selectOne(int no) throws Exception;
	int update(User user) throws Exception;
	int delete(int no) throws Exception;
	int insert(User user) throws Exception;
	User exist(String email, String password) throws Exception;
	
}
