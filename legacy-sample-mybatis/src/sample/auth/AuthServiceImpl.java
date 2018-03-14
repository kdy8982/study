package sample.auth;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sample.domain.Member;


@Service
public class AuthServiceImpl implements AuthService {
	
	@Autowired AuthDao dao;
	
	@Override
	public boolean loginCheck(Member member, HttpSession session) {
		boolean result = dao.loginCheck(member);
		if(result) {
			Member loginMember = viewMember(member);
			session.setAttribute("member", loginMember);
		}
		
		return result;
	}

	private Member viewMember(Member member) {
		return dao.viewMember(member);
	}

}
