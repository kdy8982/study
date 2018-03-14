package sample.auth;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import sample.domain.Member;

@Controller
@RequestMapping("/auth")
public class AuthController {

	@Autowired AuthService authService;
	
	
	@RequestMapping("/login")
	public String login() {
		return "auth/login";
	}

	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView loginSubmit(@ModelAttribute Member member, HttpSession session) {
		boolean result = authService.loginCheck(member, session);
		ModelAndView mav = new ModelAndView();
		
		if(result == true) {
			mav.setViewName("redirect:/member/list");
			mav.addObject("msg", "success");
		} else {
			mav.setViewName("auth/login");
			mav.addObject("msg", "failure");
		}
		return mav; 
	}

	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("member");
		return "redirect:/member/list";
	}

}
