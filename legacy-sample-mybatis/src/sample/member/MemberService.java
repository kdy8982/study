package sample.member;

import java.util.List;

import javax.servlet.http.HttpSession;

import sample.domain.Member;

public interface MemberService {
	
	void add(Member member);
	
	boolean addByCondition(Member member);
	
	void update(Member member);
	
	Member get(int id);
	
	List<Member> list();
	
	void delete(int id);

}
