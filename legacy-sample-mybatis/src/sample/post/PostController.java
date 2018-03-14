package sample.post;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import sample.domain.Post;
import sample.member.MemberService;

@Controller
@RequestMapping("/post")
@SessionAttributes("member, post")
public class PostController {
	
	@Autowired PostService postService;
	@Autowired MemberService memberService;
	
	@RequestMapping("/list")
	public void list(Model model) {
		model.addAttribute("list", postService.list());
	}

	
	@RequestMapping("/form")
	public String form(Model model) {
		model.addAttribute("post", new Post());
		return "/post/form";
	}
	
	@RequestMapping(method= RequestMethod.POST)
	public String formSubmit(@Valid Post post, BindingResult result) {
	
		if(result.hasErrors()) {
			return "post/form"; 
		}
		postService.add(post);
		return "redirect:/post/list";
	}
}
