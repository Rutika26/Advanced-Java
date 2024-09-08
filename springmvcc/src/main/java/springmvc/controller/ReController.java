package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {

	@RequestMapping("/one")
	public String one() {
		System.out.println("This is one handler");
		return "redirect:/enjoy";
	}
	
	@RequestMapping("/enjoy")
	public RedirectView two() {
		System.out.println("This is second handler[enjoy]");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("http://www.google.com");
		return redirectView;
	}
	
	@RequestMapping("/three")
	public String three() {
		System.out.println("This is third handler");
		return "";
	}
}
