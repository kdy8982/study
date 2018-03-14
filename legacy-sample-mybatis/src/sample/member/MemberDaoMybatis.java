package sample.member;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sample.domain.Member;

@Repository
public class MemberDaoMybatis implements MemberDao{

	@Autowired
	private SqlSession sqlSession;
	
	
	@Override
	public List<Member> list() {
		MemberDao memberDao = sqlSession.getMapper(MemberDao.class);
		return memberDao.list();
	}
	
	@Override
	public void add(Member member) {
		MemberDao memberDao = sqlSession.getMapper(MemberDao.class);
		member.setId((int)System.currentTimeMillis());
		memberDao.add(member);
	}

	@Override
	public void update(Member member) {
		MemberDao memberDao = sqlSession.getMapper(MemberDao.class);
		memberDao.update(member);
	}

	@Override
	public Member get(int id) {
		MemberDao memberDao = sqlSession.getMapper(MemberDao.class);
		return memberDao.get(id);
	}

	@Override
	public void delete(int id) {
		MemberDao memberDao = sqlSession.getMapper(MemberDao.class);
		memberDao.delete(id);
	}

	@Override
	public Member getByEmailPassword(Member member) {
		MemberDao memberDao = sqlSession.getMapper(MemberDao.class);
		return memberDao.getByEmailPassword(member);
	}



}
