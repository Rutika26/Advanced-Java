package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {

	@RequestMapping(path="/home",method=RequestMethod.GET)
	public String home(Model model) {
		System.out.println("This is home url");
		model.addAttribute("name", "Radha Murge");
		model.addAttribute("id", 111);
		
		List<String> friends = new ArrayList<String>();
		friends.add("Vandan");
		friends.add("Roshni");
		friends.add("ABC");
		model.addAttribute("f", friends);
		
		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about url");
		return "about";
	}
	
	@RequestMapping("help")
	public ModelAndView help() {
		System.out.println("This is help controller");
		//creating object of ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		//setting the data
		modelAndView.addObject("name","Reva Adhikari");
		modelAndView.addObject("rollNo",1234);
		LocalDateTime now=LocalDateTime.now();
		modelAndView.addObject("time",now);
		
		//marks
		List<Integer> list=new ArrayList<Integer>();
		list.add(77);
		list.add(99);
		list.add(88);
		modelAndView.addObject("marks",list);
		
		//setting the view name
		modelAndView.setViewName("help");
		return modelAndView;
	}
}
