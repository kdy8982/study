package sample.auth;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sample.domain.Member;

@Repository
public class AuthDaoMybatis implements AuthDao {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public boolean loginCheck(Member member) {
		AuthDao authDao = sqlSession.getMapper(AuthDao.class);
		String name = authDao.selectOne(member);
		return (name == null) ? false : true;
	}

	@Override
	public String selectOne(Member member) {
		AuthDao authDao = sqlSession.getMapper(AuthDao.class);
		return authDao.selectOne(member);
	}

	@Override
	public Member viewMember(Member member) {
		AuthDao authDao = sqlSession.getMapper(AuthDao.class);
		return authDao.viewMember(member);
	}

}
