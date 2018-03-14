package sample.auth;

import sample.domain.Member;
import sample.member.MemberDao;

public interface AuthDao {

	boolean loginCheck(Member member);

	String selectOne(Member member);

	Member viewMember(Member member);
	

}
