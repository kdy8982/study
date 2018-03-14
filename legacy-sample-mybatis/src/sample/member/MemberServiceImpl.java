package sample.member;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sample.domain.Member;

@Service
@Transactional
public class MemberServiceImpl implements MemberService {
	
	@Autowired MemberDao dao;

	public void add(Member member) {
		member.setJoined(new Date());
		
		System.out.println(member.toString());
		
		dao.add(member);
	}

	public void delete(int id) {
		dao.delete(id);
	}

	public Member get(int id) {
		return dao.get(id);
	}

	public List<Member> list() {
		return dao.list();
	}

	public void update(Member member) {
		dao.update(member);
	}

	@Override
	public boolean addByCondition(Member member) {
		// TODO Auto-generated method stub
		return false;
	}


}
