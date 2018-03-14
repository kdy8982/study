package sample.auth;

import javax.servlet.http.HttpSession;

import sample.domain.Member;

public interface AuthService {

	boolean loginCheck(Member member, HttpSession session);

}
